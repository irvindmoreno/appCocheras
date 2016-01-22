package com.example.daniel.appcocheras.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daniel.appcocheras.MainActivity;
import com.example.daniel.appcocheras.MenuLogeado;
import com.example.daniel.appcocheras.R;
import com.example.daniel.appcocheras.domain.Cochera;

import java.util.ArrayList;

/**
 * Created by daniel on 18/01/16.
 */
public class HistorialDeVisitasAdapter extends RecyclerView.Adapter<HistorialDeVisitasAdapter.HistorialDeVisitasViewHolder>{

    ArrayList<Cochera> cocheras;
    Context context;
    public HistorialDeVisitasAdapter(Context context) {
        this.context = context;
        this.cocheras = new ArrayList<>();
    }




    @Override
    public HistorialDeVisitasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.item_historial_de_visitas,parent,false);
        return new HistorialDeVisitasViewHolder(itemView);
        //return null;
    }

    @Override
    public void onBindViewHolder(HistorialDeVisitasViewHolder holder, int position) {
        Cochera currentCochera = cocheras.get(position);
        holder.setNombreCochera(currentCochera.getName());
        holder.setDireccionCochera(currentCochera.getDireccion());
        holder.setFechaCochera(currentCochera.getFecha());
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

    public class HistorialDeVisitasViewHolder extends RecyclerView.ViewHolder{
        TextView nombreCochera;
        TextView direccionCochera;
        TextView fechaCochera;
        public HistorialDeVisitasViewHolder(View itemView) {
            super(itemView);
            nombreCochera = (TextView)itemView.findViewById(R.id.txtNombre);
            direccionCochera = (TextView)itemView.findViewById(R.id.txtDireccion);
            fechaCochera = (TextView)itemView.findViewById(R.id.txtFecha);
        }
        public void setNombreCochera(String texto)
        {
            nombreCochera.setText(texto);
        }
        public  void  setDireccionCochera(String texto)
        {
            direccionCochera.setText(texto);
        }
        public void  setFechaCochera(String texto)
        {
            fechaCochera.setText(texto);
        }
    }

}
