package com.example.androidpreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class DetalleCuestionario extends AppCompatActivity {
    TextView fechas_ini, fechas_fin, preguntas, correctas, incorrectas, nombres;
    Config config;

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cuestionario);
        config= new Config(getApplicationContext());
        fechas_ini=findViewById(R.id.fecha_inicio);
        fechas_fin=findViewById(R.id.fecha_fin);
        preguntas=findViewById(R.id.preguntas);
        correctas=findViewById(R.id.correctas);
        incorrectas=findViewById(R.id.incorrectas);
        nombres=findViewById(R.id.nombre_persona);
        layout=findViewById(R.id.poner_cuestionarios);

        SharedPreferences archivo = getSharedPreferences("app_pregunta_v3",MODE_PRIVATE);
        String nombre = archivo.getString("nombres", null);

        //Datos enviados
        Intent intencion = getIntent();
        String fecha_ini = intencion.getStringExtra("fecha_inicio");
        String cant_preguntas = intencion.getStringExtra("cant_preguntas");
        String cant_correctas = intencion.getStringExtra("cant_correctas");
        String cant_error = intencion.getStringExtra("cant_error");
        String id_cuestionario = intencion.getStringExtra("id_cuestionario");

        nombres.setText(nombre);
        fechas_ini.setText("Fecha inicio: "+fecha_ini);
        preguntas.setText("Preguntas: "+cant_preguntas);
        correctas.setText("Incorrectas: "+cant_correctas);
        incorrectas.setText("Correctas: "+cant_error);

        cargarPreguntas(id_cuestionario);
    }

    public void cargarPreguntas(String id_cuestionario){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas-V1/DetallesCuestionario.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {

                    System.out.println("El servidor POST responde OK");
                    JsonObject lista = JsonParser.parseString(response).getAsJsonObject();
                    JsonArray lista_preguntas = lista.getAsJsonArray("preguntas");
                    TextView[] preguntas = new TextView[lista_preguntas.size()];

                    for(int i = 0; i < lista_preguntas.size(); i++) {
                        Boolean boleano=true;
                        preguntas[i] = new TextView(getApplicationContext());
                        JsonObject temporal = lista_preguntas.get(i).getAsJsonObject();
                        JsonArray opciones = temporal.getAsJsonArray("opciones");

                        TextView num_pregunta = new TextView(getApplicationContext());
                        String pregunta = temporal.get("descripcion").getAsString();
                        String respuesta = temporal.get("respuesta").getAsString();
                        String id_correcta = temporal.get("id_correcta").getAsString();
                        System.out.println(respuesta + "dsadsadasdssssssssss");
                        num_pregunta.setText("Pregunta: " + i);
                        preguntas[i].append(pregunta + "\n" + "\n");
                        preguntas[i].setBackgroundColor(Color.parseColor("#e8fbf8"));

                        num_pregunta.setTextSize(22);
                        num_pregunta.setTextColor(Color.parseColor("#000000"));
                        num_pregunta.setBackgroundColor(Color.parseColor("#e8fbf8"));
                        num_pregunta.setPadding(40, 40, 40, 40);

                        layout.addView(num_pregunta);
                        preguntas[i].setTextSize(15);
                        preguntas[i].setTextColor(Color.parseColor("#000000"));
                        preguntas[i].setPadding(40, 40, 40, 40);
                        layout.addView(preguntas[i]);

                        for (int j = 0; j < opciones.size(); j++) {
                            JsonObject temporal2 = opciones.get(j).getAsJsonObject();
                            String id_opcion = temporal2.get("id").getAsString();
                            String opcion = temporal2.get("descripcion").getAsString();
                            TextView resuestas;
                            System.out.println("id_ocion:"+id_opcion);
                            boleano=true;



                            if(respuesta.equals(id_correcta) && respuesta.equals(id_opcion)){
                                resuestas = new TextView(getApplicationContext());
                                resuestas.append("-" + opcion + "\n" + "\n");
                                resuestas.setTextColor(Color.parseColor("#12a14b"));
                                resuestas.setBackgroundColor(Color.parseColor("#e8fbf8"));
                                resuestas.setTextSize(17);
                                layout.addView(resuestas);
                            } else if (!respuesta.equals(id_correcta) && respuesta.equals(id_opcion)) {
                                resuestas = new TextView(getApplicationContext());
                                resuestas.append("-" + opcion + "\n" + "\n");
                                resuestas.setTextColor(Color.parseColor("#cc0605"));
                                resuestas.setBackgroundColor(Color.parseColor("#e8fbf8"));
                                resuestas.setTextSize(17);
                                layout.addView(resuestas);
                            }else {
                                resuestas = new TextView(getApplicationContext());
                                resuestas.append("-" + opcion + "\n" + "\n");
                                resuestas.setTextColor(Color.parseColor("#000000"));
                                resuestas.setBackgroundColor(Color.parseColor("#e8fbf8"));
                                resuestas.setTextSize(17);
                                layout.addView(resuestas);
                            }


                        }


                    }


                    System.out.println(lista_preguntas);
                } catch (Exception e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
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
                params.put("id_cuestionario", id_cuestionario);



                return params;
            }
        };

        queue.add(solicitud);
    }


    public void volver(View vista){
        finish();
    }
}