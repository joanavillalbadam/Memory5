package com.exemple.profedam.memory.model;

import com.exemple.profedam.memory.R;

/**
 * Created by ALUMNEDAM on 29/01/2016.
 */
public class Carta {

 public enum Estat {
     BACK, FRONT, FIXED
 }
private final int backImage =  R.drawable.back;
private int frontImage;
    private Estat estat;

    public Carta(int frontImage) {
        this.frontImage = frontImage;
        this.estat = Estat.BACK;
    }

    public int getFrontImage() {
        return frontImage;
    }

    public Estat getEstat() {
        return estat;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

    public void girar()
    {
        //TODO canviar lógicamente el estado de la carta

    }

    public int getActive()
    {
        //TODO devuelve la foto a mostrar en la aplicación
        return 0;
    }


}
