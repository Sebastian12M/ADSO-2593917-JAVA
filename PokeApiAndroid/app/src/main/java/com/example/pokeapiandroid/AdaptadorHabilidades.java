package com.example.pokeapiandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorHabilidades extends RecyclerView.Adapter<AdaptadorHabilidades.ViewHolder> {
    List<String> listaHabilidades;

    public AdaptadorHabilidades(List<String> lista){
        this.listaHabilidades=lista;
    }

    @NonNull
    @Override
    public AdaptadorHabilidades.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.habilidades, parent, false);
        return new AdaptadorHabilidades.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHabilidades.ViewHolder holder, int position) {
        String temporal=listaHabilidades.get(position);
        int numeroPokemon = position + 1;
        holder.cargarDatos(temporal, numeroPokemon);

    }

    @Override
    public int getItemCount() {
        return listaHabilidades.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView habilidades;
        Context contexto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contexto=itemView.getContext();

            habilidades=itemView.findViewById(R.id.habilidad);


        }

        public void cargarDatos(String datos, int num){
            habilidades.setText(datos);
        }
    }
}
