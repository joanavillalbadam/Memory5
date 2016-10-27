package com.exemple.profedam.memory.controllers;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.exemple.profedam.memory.R;
import com.exemple.profedam.memory.model.Partida;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private Partida partida;
   // private int numColumnas, anchoColumna, alturaColumna;


    public ImageAdapter(Context c, Partida p) {

        mContext = c;
        partida = p;



    }


    public int getCount() {

        return partida.getNumeroCartes();

    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(280,320));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(8, 8, 8, 8);

            /* TODO hay que visualizar la imagen de la carta
            correspondiente del ArrayList */
             imageView.setImageResource (partida.getLlistaCartes().get(position).getFrontImage());
            // imageView.setImageResource(R.drawable.back);

        } else {
            imageView = (ImageView) convertView;
        }

        return imageView;
    }

















}
