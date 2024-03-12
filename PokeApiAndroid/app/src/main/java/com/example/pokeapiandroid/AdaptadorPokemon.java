package com.example.pokeapiandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class AdaptadorPokemon extends RecyclerView.Adapter<AdaptadorPokemon.ViewHolder> {

    List<Pokomones> listaPokemons;
    public AdaptadorPokemon(List<Pokomones> lista){
        this.listaPokemons=lista;
    }

    @NonNull
    @Override
    public AdaptadorPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPokemon.ViewHolder holder, int position) {
        Pokomones temporal=listaPokemons.get(position);
        int numeroPokemon = position + 1;
        holder.cargarDatos(temporal, numeroPokemon);
    }

    @Override
    public int getItemCount() {
        return listaPokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView num_pokemon;
        TextView nombre_poke;
        ImageView btn_detalle;
        Context contexto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contexto=itemView.getContext();

            num_pokemon=itemView.findViewById(R.id.numero_pokemon);
            nombre_poke=itemView.findViewById(R.id.nombre_pokemon);
            btn_detalle = itemView.findViewById(R.id.btn_detalles_pokemon);

        }

        public void cargarDatos(Pokomones datos, int num){
            num_pokemon.setText(String.valueOf(num));
            nombre_poke.setText(datos.getNombre());


            btn_detalle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(contexto, datos.getNombre(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
