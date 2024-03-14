package com.example.pokeapiandroid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorImagenes extends RecyclerView.Adapter<AdaptadorImagenes.ViewHolder> {
    List<String> listaImagenes;

    public AdaptadorImagenes(List<String> lista){
        this.listaImagenes=lista;
    }

    @NonNull
    @Override
    public AdaptadorImagenes.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.imagenes_pokemon, parent, false);
        return new AdaptadorImagenes.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorImagenes.ViewHolder holder, int position) {
        String temporal=listaImagenes.get(position);
        int numeroPokemon = position + 1;
        holder.cargarDatos(temporal, numeroPokemon);

    }

    @Override
    public int getItemCount() {
        return listaImagenes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imagen;
        Context contexto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contexto=itemView.getContext();

            imagen=itemView.findViewById(R.id.imagen_pokemon);


        }

        public void cargarDatos(String datos, int num){

            Picasso.get().load(datos).into(imagen);


        }
    }
}
