package com.exemple.profedam.memory.model;

import com.exemple.profedam.memory.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static com.exemple.profedam.memory.model.Carta.Estat.FRONT;

/**
 * Created by ALUMNEDAM on 29/01/2016.
 */
public class Partida {

    int totalCartes[] ={
            R.drawable.c0, R.drawable.c1,
            R.drawable.c2, R.drawable.c3,
            R.drawable.c4, R.drawable.c5,
            R.drawable.c6, R.drawable.c7,
            R.drawable.c8, R.drawable.c9,
            R.drawable.c10, R.drawable.c11

    };
    ArrayList<Carta> llistaCartes = new ArrayList<Carta>();
    int numeroCartes;
  //  boolean Torn;
    private Carta.Estat[] getLlistaCartes;
    public int cont;

    public ArrayList<Carta> cartasFront = new ArrayList<>();

    public Partida (ArrayList<Carta> llistaCartes, int numeroCartes){
        this.llistaCartes = llistaCartes;
        this.numeroCartes = numeroCartes;
       // this.Torn = Torn;
    }
    public ArrayList<Carta> getLlistaCartes() {
        return llistaCartes;
    }

   // public boolean getTorn() {
     //   return Torn;
   // }

    public ArrayList<Carta> comprovacion(){
        for(int i = 0; i < llistaCartes.size();i++){
            if(llistaCartes.get(i).getEstat() == Carta.Estat.FRONT){
                cartasFront.add(this.llistaCartes.get(i));
            }
        }
        return cartasFront;
    }

    public Partida(int numeroCartes){
        //TODO hacer que no salgan siempre las primeras 6 cartas
        //El truco es desordenar el array de enteros y despues que coja los 6 primeros
        this.numeroCartes = numeroCartes;
        //TODO rellenar llistaCartes

        this.llistaCartes = new ArrayList();
      //  this.Torn = new boolean[];
        for(int i =0; i < numeroCartes; i++) {


            llistaCartes.add(new Carta(totalCartes[i/2]));

            if(i%2==0){
                //Torn = true;
                //getTorn() = true;

            }else{
               // Torn = false;
            }

            //Partida partida = new Partida(12);
        }
        Collections.shuffle(llistaCartes);
        }



    public int getNumeroCartes() {
        return numeroCartes;
    }


    public boolean comprovaCartesIguals(){
        if (cartasFront.get(0) != cartasFront.get(1)){
            return true;
        }
        return false;
    }

}
