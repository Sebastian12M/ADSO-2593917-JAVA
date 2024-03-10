package com.example.androidpreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MostrarPreguntas extends AppCompatActivity {

    TextView usuario, fecha, pregunta, mostrarPregunta;
    RadioGroup layout;
    Config config;
    String respuesta_correcta;
    RadioButton[] seleccion;

    String[] id_opciones;

    String id_cuestionario;

    String id_pregunta;

    LinearLayout poner_imagen;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_preguntas);
        SharedPreferences archivo = getSharedPreferences("app_pregunta_v3", MODE_PRIVATE);
        String nombre = archivo.getString("nombres","");
        Intent intencion = getIntent();
        id_cuestionario = intencion.getStringExtra("id_cuestionario");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentDateandTime = simpleDateFormat.format(new Date());
        config= new Config(getApplicationContext());
        usuario=findViewById(R.id.usuario);
        fecha = findViewById(R.id.fecha);
        layout=findViewById(R.id.poner_preguntas);
        poner_imagen=findViewById(R.id.imprimir_opciones);

        mostrarPregunta=findViewById(R.id.mostrar_pregunta);
        usuario.setText(nombre);
        fecha.setText("Inicio: "+currentDateandTime);
        cargarPreguntas(id_cuestionario);



    }

    public void cargarPreguntas(String id_cuestionario){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas-V1/SeleccionarPreguntas.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {



                    System.out.println("El servidor POST responde OK");



                    JsonObject pregunta = JsonParser.parseString(response).getAsJsonObject();
                    String estado = pregunta.get("status").getAsString();

                        String descripcion = pregunta.get("pregunta").getAsJsonObject().get("descripcion").getAsString();

                        String imagenUrl = pregunta.get("pregunta").getAsJsonObject().get("url_imagen").getAsString();

                        id_pregunta=pregunta.get("pregunta").getAsJsonObject().get("id").getAsString();

                        respuesta_correcta=pregunta.get("pregunta").getAsJsonObject().get("id_correcta").getAsString();

                        JsonArray opciones = pregunta.getAsJsonObject("pregunta").getAsJsonArray("opciones");

                        ImageView imagen = new ImageView(getApplicationContext());

                        seleccion = new RadioButton[opciones.size()];


                        Picasso.get().load(imagenUrl).resize(400, 300).into(imagen);
                        poner_imagen.addView(imagen);
                        id_opciones = new String[opciones.size()];
                        for(int i = 0;i<opciones.size();i++){

                            seleccion[i] = new RadioButton(getApplicationContext());

                            JsonObject temporal = opciones.get(i).getAsJsonObject();
                            String option = temporal.get("descripcion").getAsString();
                            id_opciones[i]=temporal.get("id").getAsString();
                            System.out.println(id_opciones[i]+"sdasas"+respuesta_correcta);
                            seleccion[i].setText(option);
                            seleccion[i].setTextSize(20);


                            layout.addView(seleccion[i]);

                        }


                        mostrarPregunta.setText(descripcion);
                        System.out.println(descripcion);


                } catch (Exception e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                    finalizarCuestionario();
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


    public void validarRespuesta(){
        for (int i = 0; i < seleccion.length; i++) {

            if(seleccion[i].isChecked()){

                if(id_opciones[i].equals(respuesta_correcta)){

                    String id_respuesta=id_opciones[i];
                    RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                    String url = config.getEndpoint("ApiPreguntas-V1/InsertarRespuestas.php");

                    StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                System.out.println("El servidor POST responde OK");
                                JSONObject jsonObject = new JSONObject(response);

                                System.out.println(response);
                            } catch (JSONException e) {
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
                            params.put("id_pregunta", id_pregunta);
                            params.put("respuesta", id_respuesta);
                            params.put("estado", "OK");



                            return params;
                        }
                    };

                    queue.add(solicitud);



                }else{
                    String id_respuesta=id_opciones[i];
                    RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                    String url = config.getEndpoint("ApiPreguntas-V1/InsertarRespuestas.php");

                    StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                System.out.println("El servidor POST responde OK");
                                JSONObject jsonObject = new JSONObject(response);

                                System.out.println(response);
                            } catch (JSONException e) {
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
                            params.put("id_pregunta", id_pregunta);
                            params.put("respuesta", id_respuesta);
                            params.put("estado", "ERROR");



                            return params;
                        }
                    };

                    queue.add(solicitud);

                }
            }
        }
    }


    public void finalizarCuestionario(){
        Intent intencion = new Intent(MostrarPreguntas.this, Ventana_Principal.class);
        startActivity(intencion);
    }

    public void cambiarPregunta(View v){

        int selectedRadioButtonId = layout.getCheckedRadioButtonId();
        if(selectedRadioButtonId != -1){
            validarRespuesta();
            recreate();
        }else{
            Toast.makeText(this, "Seleccione una respuesta", Toast.LENGTH_SHORT).show();
        }

    }

}

