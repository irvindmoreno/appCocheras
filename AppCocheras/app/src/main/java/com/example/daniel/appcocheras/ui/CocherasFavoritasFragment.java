package com.example.daniel.appcocheras.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daniel.appcocheras.R;
import com.example.daniel.appcocheras.domain.Cochera;
import com.example.daniel.appcocheras.ui.adapter.CocherasFavoritasAdapter;
import com.example.daniel.appcocheras.ui.adapter.HistorialDeVisitasAdapter;

import java.util.ArrayList;

/**
 * Created by daniel on 22/01/16.
 */
public class CocherasFavoritasFragment extends Fragment {
    private RecyclerView mCocherasFavoritas;
    private CocherasFavoritasAdapter adapter;
    @Override
    public void onCreate(@Nullable Bundle SavedInstanceState)
    {
        super.onCreate(SavedInstanceState);
        adapter = new CocherasFavoritasAdapter(getActivity());
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_cocheras_favoritas,container,false);
        mCocherasFavoritas =(RecyclerView)root.findViewById(R.id.id_fragmento_cocheras_favoritas);
        configuracionHistorialDeVisitas();
        datosDePrueba();
        return root;

    }

    private void configuracionHistorialDeVisitas()
    {
        //Aqui le decimos como queremos que se comporte el Recyler si como grid o como list
        //mHistorialDeVisitas.setLayoutManager(new );
        mCocherasFavoritas.setLayoutManager(new LinearLayoutManager(getActivity()));
        mCocherasFavoritas.setAdapter(adapter);
    }
    private void datosDePrueba()
    {
        ArrayList<Cochera> cocheras = new ArrayList<>();
        cocheras.add(new Cochera("Luchito","La Esperanza","17 de Enero"));
        cocheras.add(new Cochera("San Andres", "El Milagro", "14 de Enero"));
        cocheras.add(new Cochera("San Augustin", "El cento", "12 de Enero"));
        cocheras.add(new Cochera("Twins","La Esperanza","20 de Enero"));
        cocheras.add(new Cochera("Luchito","La Esperanza","12 de Enero"));
        cocheras.add(new Cochera("Luchito","La Esperanza","31 de Enero"));
        cocheras.add(new Cochera("Luchito", "La Esperanza", "17 de Marzo"));
        adapter.addAll(cocheras);
    }
}
