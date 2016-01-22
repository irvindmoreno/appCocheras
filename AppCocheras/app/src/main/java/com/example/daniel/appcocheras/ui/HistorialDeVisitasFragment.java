package com.example.daniel.appcocheras.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.daniel.appcocheras.R;
import com.example.daniel.appcocheras.domain.Cochera;
import com.example.daniel.appcocheras.ui.adapter.HistorialDeVisitasAdapter;

import java.util.ArrayList;

/**
 * Created by daniel on 15/01/16.
 */
public class HistorialDeVisitasFragment extends Fragment {

    private RecyclerView mHistorialDeVisitas;
    public HistorialDeVisitasAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        adapter = new HistorialDeVisitasAdapter(getActivity());
    }

    @Nullable
    @Override
    //LayoutInflater inflater => se recibe desde el activity
    //ViewGroup container => puede ser un linerlayout, relativelayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        //R.layout.fragment_historial_de_visitas => Es lo que quiero inflar
        //container => donde quieres que este inflado
        //root => es la vista en conjunto de Iodo nuestro fragmento inflado
        View root = inflater.inflate(R.layout.fragment_historial_de_visitas,container,false);

        mHistorialDeVisitas=(RecyclerView)root.findViewById(R.id.id_fragmento);
        configuracionHistorialDeVisitas();
        datosDePrueba();
        return root;
    }

    //crearemos una funcion en donde tendremos todas las configuraciones iniciales del recyclervie
    private void configuracionHistorialDeVisitas()
    {
        //Aqui le decimos como queremos que se comporte el Recyler si como grid o como list
        //mHistorialDeVisitas.setLayoutManager(new );
        mHistorialDeVisitas.setLayoutManager(new LinearLayoutManager(getActivity()));
        mHistorialDeVisitas.setAdapter(adapter);
    }
    private void datosDePrueba()
    {
        ArrayList<Cochera> cocheras = new ArrayList<>();

            cocheras.add(new Cochera("Luchito","La Esperanza","17 de Enero"));
            cocheras.add(new Cochera("San Andres","El Milagro","14 de Enero"));
            cocheras.add(new Cochera("San Augustin","El cento","12 de Enero"));
            cocheras.add(new Cochera("Twins","La Esperanza","20 de Enero"));
            cocheras.add(new Cochera("Luchito","La Esperanza","12 de Enero"));
            cocheras.add(new Cochera("Luchito","La Esperanza","31 de Enero"));
            cocheras.add(new Cochera("Luchito","La Esperanza","17 de Marzo"));

        adapter.addAll(cocheras);
    }
}
