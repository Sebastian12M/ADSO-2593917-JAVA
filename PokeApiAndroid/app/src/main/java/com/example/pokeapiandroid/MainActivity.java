package com.example.pokeapiandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    List <Pokomones> pokemones;

    Button boton_atras;
    String sgt;
    String atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recycler_pokemons);
        boton_atras=findViewById(R.id.btn_atras);
        Pokemones();



    }

    public void Pokemones(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://pokeapi.co/api/v2/pokemon/";

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    System.out.println("El servidor responde OK");
                    System.out.println(response.toString());
                    JSONArray arreglo = response.getJSONArray("results");
                    sgt = response.getString("next");
                    atras=response.getString("previous");

                    if(atras!=null){

                    }


                    System.out.println(sgt+"dsadas");
                    pokemones = new ArrayList<>();
                    for (int i=0;i<arreglo.length();i++){
                        JSONObject temporal = arreglo.getJSONObject(i);
                        String nombre = temporal.getString("name");
                        String url = temporal.getString("url");



                        pokemones.add(new Pokomones(nombre, url));
                        System.out.println("Nombre: "+nombre);
                        System.out.println("Url: "+url);
                    }

                    AdaptadorPokemon adaptador = new AdaptadorPokemon(pokemones);

                    recycler.setAdapter(adaptador);
                    recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
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

    public void siguiente(View v){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());


        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, sgt, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    System.out.println("El servidor responde OK");
                    System.out.println(response.toString());
                    JSONArray arreglo = response.getJSONArray("results");
                    pokemones = new ArrayList<>();
                    sgt = response.getString("next");
                    atras=response.getString("previous");


                    for (int i=0;i<arreglo.length();i++){
                        JSONObject temporal = arreglo.getJSONObject(i);
                        String nombre = temporal.getString("name");
                        String url = temporal.getString("url");


                        pokemones.add(new Pokomones(nombre, url));
                        System.out.println("Nombre: "+nombre);
                        System.out.println("Url: "+url);
                    }

                    AdaptadorPokemon adaptador = new AdaptadorPokemon(pokemones);

                    recycler.setAdapter(adaptador);
                    recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
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

    public void atras(View v){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());


        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, atras, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    System.out.println("El servidor responde OK");
                    System.out.println(response.toString());
                    JSONArray arreglo = response.getJSONArray("results");
                    pokemones = new ArrayList<>();
                    sgt = response.getString("next");
                    atras=response.getString("previous");
                    for (int i=0;i<arreglo.length();i++){

                        JSONObject temporal = arreglo.getJSONObject(i);
                        String nombre = temporal.getString("name");
                        String url = temporal.getString("url");




                        pokemones.add(new Pokomones(nombre, url));
                        System.out.println("Nombre: "+nombre);
                        System.out.println("Url: "+url);
                    }

                    AdaptadorPokemon adaptador = new AdaptadorPokemon(pokemones);

                    recycler.setAdapter(adaptador);
                    recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
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