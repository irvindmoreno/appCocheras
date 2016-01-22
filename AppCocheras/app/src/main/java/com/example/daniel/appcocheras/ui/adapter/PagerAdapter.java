package com.example.daniel.appcocheras.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by daniel on 19/01/16.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> framents;
    public PagerAdapter(FragmentManager fm,ArrayList<Fragment> framents) {
        super(fm);
        this.framents=framents;
    }

    @Override
    public Fragment getItem(int position) {
        return framents.get(position);
    }

    @Override
    public int getCount() {
        return framents.size();
    }
}
