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
    TextView nombre_pokemon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_pokemon);
        recycler=findViewById(R.id.recycler_imagenes);
        nombre_pokemon=findViewById(R.id.nombre_poke);
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

                    List<String> imagenes = new ArrayList<>();


                    imagenes.add(back_default);
                    imagenes.add(back_shiny);
                    imagenes.add(front);
                    imagenes.add(front_shiny);






                    AdaptadorImagenes adaptador = new AdaptadorImagenes(imagenes);

                    recycler.setAdapter(adaptador);
                    recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
                    nombre_pokemon.setText(nombre);
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