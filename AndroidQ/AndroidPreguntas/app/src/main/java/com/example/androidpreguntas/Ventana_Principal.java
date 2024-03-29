package com.example.androidpreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.androidpreguntas.utils.Config;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class Ventana_Principal extends AppCompatActivity {
    TextView id_usuario, nombre;
    Config config;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_principal);
        id_usuario=findViewById(R.id.id_usuario);
        nombre=findViewById(R.id.nombre);
        config= new Config(getApplicationContext());
        layout=findViewById(R.id.contenedor);

        SharedPreferences archivo = getSharedPreferences("app_pregunta_v3", MODE_PRIVATE);


        String nombres= archivo.getString("nombres","");
        String id_usuarios= archivo.getString("id_usuario","");
        Toast.makeText(this, "Hola "+nombres, Toast.LENGTH_SHORT).show();
        nombre.setText(nombres);
        cargarCuestionarios(id_usuarios);
    }

    public void cargarCuestionarios(String id_usuarios){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas-V1/TraerCuestionarios.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {

                    JsonObject lista = JsonParser.parseString(response).getAsJsonObject();
                    JsonArray lista_cuestionarios = lista.getAsJsonArray("registros");
                    TextView[] cuestionario = new TextView[lista_cuestionarios.size()];

                    for (int i=0;i<lista_cuestionarios.size();i++){
                        cuestionario[i]= new TextView(getApplicationContext());
                        TextView espacio = new TextView(getApplicationContext());
                        JsonObject temporal = lista_cuestionarios.get(i).getAsJsonObject();

                        String cant_correctas = temporal.get("cant_ok").getAsString();
                        String id_cuestionario = temporal.get("id").getAsString();
                        String fecha_inicio = temporal.get("fecha_inicio").getAsString();
                        String cant_preguntas = temporal.get("cant_preguntas").getAsString();
                        String cant_inco = temporal.get("cant_error").getAsString();


                        cuestionario[i].append("Numero: "+id_cuestionario+"\n");
                        cuestionario[i].append("Fecha inicio: "+fecha_inicio+"\n");
                        cuestionario[i].append("Cant preguntas: "+cant_preguntas+"\n");
                        cuestionario[i].append("Cant correctas: "+cant_correctas+" - ");
                        cuestionario[i].append("Cant incorretas: "+cant_inco+"\n");

                        espacio.append(" ");

                        cuestionario[i].setTextColor(Color.parseColor("#000000"));
                        cuestionario[i].setTextSize(15);
                        cuestionario[i].setPadding(50, 50,50,10);
                        cuestionario[i].setBackgroundColor(Color.parseColor("#e8fbf8"));


                        cuestionario[i].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                cargarCuestionario(id_cuestionario,cant_preguntas,cant_correctas,cant_inco,fecha_inicio);
                            }
                        });


                        layout.addView(cuestionario[i]);
                        layout.addView(espacio);

                    }
                    System.out.println(response);
                    System.out.println("El servidor POST responde OK");








                } catch (Exception e) {
                    System.out.println("El servidor POST responde con un error:");

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){

            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_usuarios", id_usuarios);



                return params;
            }
        };

        queue.add(solicitud);
    }

    public void nuevoCuestionario(View v){
        Intent intencion = new Intent(Ventana_Principal.this,NuevoCuestionario.class);
        startActivity(intencion);
    }

    public void cargarCuestionario(String id_cuestionario, String cant_preguntas, String cant_correctas, String cant_error, String fecha_inicio){
        Intent intencion = new Intent(Ventana_Principal.this, DetalleCuestionario.class);
        intencion.putExtra("id_cuestionario", id_cuestionario);
        intencion.putExtra("cant_preguntas", cant_preguntas);
        intencion.putExtra("cant_correctas", cant_correctas);
        intencion.putExtra("cant_error", cant_error);
        intencion.putExtra("fecha_inicio", fecha_inicio);

        startActivity(intencion);
    }


    public void cerrarSesion(View vista){
        SharedPreferences arhcivo = getSharedPreferences("app_pregunta_v3", MODE_PRIVATE);
        SharedPreferences.Editor editor = arhcivo.edit();
        editor.clear();
        editor.commit();

        Intent intencion = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intencion);
        finish();

    }
}