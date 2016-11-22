package com.exemple.profedam.memory.controllers;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

import com.exemple.profedam.memory.model.Carta;
import com.exemple.profedam.memory.model.Partida;


/**
 * Created by ALUMNEDAM on 02/02/2016.
 */
public class GeneralListener implements AdapterView.OnItemClickListener, Runnable {

    private int cont = 0;
    private MainActivity tauler;
    private Carta cartaOnClick;
    private boolean isActive = true;

    public GeneralListener(MainActivity tauler) {
        this.tauler = tauler;
    }

    //ImageView imageView;

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        if (isActive) {
            cartaOnClick = tauler.getPartida().getLlistaCartes().get(position);
            cartaOnClick.girar();
            tauler.refrescarTablero();
            tauler.getPartida().comprovacion();
            if (tauler.getPartida().comprovacion().size() == 2 && tauler.getPartida().cartasFront.get(0) != tauler.getPartida().cartasFront.get(1)) {
                isActive = false;

                //Pausar la UI 2000 ms
                Handler delay = new Handler();
                delay.postDelayed(this, 2000);

                run();
            }

           // Toast.makeText(tauler, "position" + position, Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void run() {
        if (tauler.getPartida().comprovacion().get(0).getFrontImage() == tauler.getPartida().comprovacion().get(1).getFrontImage()) {
            tauler.getPartida().comprovacion().get(0).setEstat(Carta.Estat.FIXED);
            tauler.getPartida().comprovacion().get(1).setEstat(Carta.Estat.FIXED);
        } else {
            tauler.getPartida().comprovacion().get(0).setEstat(Carta.Estat.BACK);
            tauler.getPartida().comprovacion().get(1).setEstat(Carta.Estat.BACK);
        }
        tauler.refrescarTablero();
        isActive = true;

    }
}