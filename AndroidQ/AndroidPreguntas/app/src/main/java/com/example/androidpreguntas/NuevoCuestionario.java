package com.example.androidpreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.androidpreguntas.utils.Config;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class NuevoCuestionario extends AppCompatActivity {


    TextView nombre_user, fecha_ini;
    Config config;

    String id_usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_cuestionario);
       nombre_user = findViewById(R.id.nombre_usuario);
       fecha_ini = findViewById(R.id.fecha_inicio);

        SharedPreferences archivo = getSharedPreferences("app_pregunta_v3", MODE_PRIVATE);
        String usuario = archivo.getString("nombres","");
        id_usuario = archivo.getString("id_usuario","");
        config=new Config(getApplicationContext());
        System.out.println(id_usuario);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentDateandTime = simpleDateFormat.format(new Date());

        fecha_ini.setText(currentDateandTime);
        nombre_user.setText(usuario);
    }

    public void cambiarAtivity(String id_cuestionario){
        Intent intencion = new Intent(NuevoCuestionario.this, MostrarPreguntas.class);
        intencion.putExtra("id_cuestionario", id_cuestionario);
        startActivity(intencion);
    }

    public void empezarCuestionario(View v){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas-V1/NuevoCuestionario.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    String id_cuestionario = jsonObject.getString("id");
                    cambiarAtivity(id_cuestionario);

                    System.out.println(response);
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
                params.put("id_usuarios", id_usuario);



                return params;
            }
        };

        queue.add(solicitud);
    }
}