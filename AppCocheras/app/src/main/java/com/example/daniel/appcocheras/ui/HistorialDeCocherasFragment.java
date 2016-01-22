package com.example.daniel.appcocheras.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daniel.appcocheras.R;

/**
 * Created by daniel on 22/01/16.
 */
public class HistorialDeCocherasFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_hitorial_de_cochera,container,false);
        return root;
    }

}
