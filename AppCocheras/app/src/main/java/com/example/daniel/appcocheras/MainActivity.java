package com.example.daniel.appcocheras;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.daniel.appcocheras.ui.AnioCocheraHistorialFragment;
import com.example.daniel.appcocheras.ui.HistorialDeVisitasFragment;
import com.example.daniel.appcocheras.ui.MesCocheraHistorialFragment;
import com.example.daniel.appcocheras.ui.SemanaCocheraHistorialFragment;
import com.example.daniel.appcocheras.ui.adapter.PagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        /**Esto es para que te aparesca la felcha atras***/
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /**Esto es para que te aparesca la felcha atras***/
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        setupViewPager();
        if(toolbar != null)
        {
            setSupportActionBar(toolbar);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        onBackPressed();
        return true;
    }
    private void setupViewPager()
    {
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), buildFragment()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Semana");

        tabLayout.getTabAt(1).setText("Mes");
        tabLayout.getTabAt(2).setText("Año");
        //tabLayout.getTabAt(3).setText("Año");
    }
    private ArrayList<Fragment> buildFragment()
    {
        ArrayList<Fragment> fragments = new ArrayList<>();
        //HistorialDeVisitasFragment historialDeVisitasFragment = new HistorialDeVisitasFragment();

        SemanaCocheraHistorialFragment semanaCocheraHistorialFragment = new SemanaCocheraHistorialFragment();
        MesCocheraHistorialFragment mesCocheraHistorialFragment = new MesCocheraHistorialFragment();
        AnioCocheraHistorialFragment anioCocheraHistorialFragment = new AnioCocheraHistorialFragment();
        //fragments.add(historialDeVisitasFragment);

        fragments.add(semanaCocheraHistorialFragment);
        fragments.add(mesCocheraHistorialFragment);
        fragments.add(anioCocheraHistorialFragment);
        return fragments;
    }
    public void abrirCocheraDetalle()
    {

    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/




}
/*
  // Verificamos si el usario no giro su celular
        if (savedInstanceState==null)
        {
            //Esto me permitira manipular fragmentos
            /*En add agregaremos los framentos,
                - En el primer parametro indicamos el id el layout(frame,relative) del activiti donde pondremos el fragmento
                - En el segundo parametro ponemos la clase del fragmento que usaremos
             */
// puedes agregar mas add si gustas
// hacemos commit
    /*
getSupportFragmentManager().beginTransaction()
        .add(R.id.main_container,new HistorialDeVisitasFragment())
        .commit();
        }
* */