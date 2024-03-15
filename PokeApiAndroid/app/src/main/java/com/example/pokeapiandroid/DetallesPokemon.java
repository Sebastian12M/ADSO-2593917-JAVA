package com.example.pokeapiandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DetallesPokemon extends AppCompatActivity {
    RecyclerView recycler;

    RecyclerView recycler_habi;
    TextView nombre_pokemon;
    TextView alturas;
    TextView pesos;

    List <String> listaHabilidades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_pokemon);
        recycler=findViewById(R.id.recycler_imagenes);
        recycler_habi=findViewById(R.id.recycler_habilidades);
        nombre_pokemon=findViewById(R.id.nombre_poke);
        pesos=findViewById(R.id.peso);
        alturas=findViewById(R.id.altura);
        CargarDetalles();
    }



    public void CargarDetalles(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        Intent intencio = getIntent();

        String url = intencio.getStringExtra("url");
        String nombre = intencio.getStringExtra("nombre");
        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    System.out.println("El servidor responde OK");
                    System.out.println(response.toString());






                    JSONObject sprites = response.getJSONObject("sprites");


                    String back_default = sprites.getString("back_default");
                    String back_shiny = sprites.getString("back_shiny");
                    String front = sprites.getString("front_default");
                    String front_shiny= sprites.getString("front_shiny");
                    String peso = String.valueOf(response.getInt("weight"));
                    String altura = String.valueOf(response.getInt("height"));
                    List<String> imagenes = new ArrayList<>();
                    System.out.println(peso+"dsaaaaaaaaaaaa");

                    imagenes.add(back_default);
                    imagenes.add(back_shiny);
                    imagenes.add(front);
                    imagenes.add(front_shiny);


                    JSONArray arreglo = response.getJSONArray("abilities");
                    listaHabilidades = new ArrayList<>();
                    System.out.println(arreglo);

                    for (int i = 0;i<arreglo.length();i++){
                        JSONObject temporal = arreglo.getJSONObject(i);
                        String habilidad = temporal.getJSONObject("ability").getString("name");




                        listaHabilidades.add(habilidad);

                    }







                    AdaptadorImagenes adaptador = new AdaptadorImagenes(imagenes);


                    recycler.setAdapter(adaptador);
                    recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));

                    AdaptadorHabilidades adaptador_habilidades =new AdaptadorHabilidades(listaHabilidades);
                    recycler_habi.setAdapter(adaptador_habilidades);
                    recycler_habi.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


                    nombre_pokemon.setText(nombre);
                    pesos.setText(peso);
                    alturas.setText(altura);


                }catch (JSONException e){
                    System.out.println(e);
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }
}