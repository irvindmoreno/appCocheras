package com.example.daniel.appcocheras.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daniel.appcocheras.R;
import com.example.daniel.appcocheras.domain.Cochera;

import java.util.ArrayList;

/**
 * Created by daniel on 18/01/16.
 */
public class CocherasFavoritasAdapter extends RecyclerView.Adapter<CocherasFavoritasAdapter.CocherasFavoritasViewHolder>{

    ArrayList<Cochera> cocheras;
    Context context;
    public CocherasFavoritasAdapter(Context context) {
        this.context = context;
        this.cocheras = new ArrayList<>();
    }




    @Override
    public CocherasFavoritasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.item_cocheras_favoritas,parent,false);
        return new CocherasFavoritasViewHolder(itemView);
        //return null;
    }
    public void mostrarCochera()
    {

    }

    @Override
    public void onBindViewHolder(CocherasFavoritasViewHolder holder, int position) {
        Cochera currentCochera = cocheras.get(position);
        holder.setNombreCochera(currentCochera.getName());
        holder.setDireccionCochera(currentCochera.getDireccion());
       // holder.setFechaCochera(currentCochera.getFecha());
    }

    @Override
    public int getItemCount() {
        return cocheras.size();
    }
    public void addAll(@NonNull ArrayList<Cochera> cocheras)
    {
        if (cocheras==null)
        {
            throw new NullPointerException("No puede estar nulo");
        }
        this.cocheras.addAll(cocheras);
        notifyItemRangeInserted(getItemCount() - 1, cocheras.size());
        notifyDataSetChanged();
    }

    public class CocherasFavoritasViewHolder extends RecyclerView.ViewHolder{
        TextView nombreCochera;
        TextView direccionCochera;
        //TextView fechaCochera;
        public CocherasFavoritasViewHolder(View itemView) {
            super(itemView);
            nombreCochera = (TextView)itemView.findViewById(R.id.txtNombre);
            direccionCochera = (TextView)itemView.findViewById(R.id.txtDireccion);
           // fechaCochera = (TextView)itemView.findViewById(R.id.txtFecha);
        }
        public void setNombreCochera(String texto)
        {
            nombreCochera.setText(texto);
        }
        public  void  setDireccionCochera(String texto)
        {
            direccionCochera.setText(texto);
        }
        /*public void  setFechaCochera(String texto)
        {
            fechaCochera.setText(texto);
        }*/
    }
}
