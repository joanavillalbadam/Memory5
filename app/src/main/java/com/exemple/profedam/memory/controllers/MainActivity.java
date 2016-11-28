package com.exemple.profedam.memory.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.exemple.profedam.memory.R;

/**
 * Created by ALUMNEDAM on 23/11/2016.
 */

public class MainActivity extends Activity implements View.OnClickListener{

        private Button primero, segundo, tercero;
        public int numCart;
    public final int REQUEST_CODE = 560;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dificultad);

         primero = (Button) findViewById(R.id.checkBox);
         segundo = (Button) findViewById(R.id.checkBox2);
         tercero = (Button) findViewById(R.id.checkBox3);


    }

    public int getNumCart() {
        return numCart;
    }
//public void loguearCheckbox(View v) {
       // String s = "Estado: " + (primero.isChecked() ? "Marcado" : "No Marcado");
      //  Toast.makeText(this, s, Toast.LENGTH_LONG).show();
   // }

    public void onClick(View view) {
        if(view == primero) {
            Intent intent = new Intent(this, MuestraCartas.class);
            intent.putExtra("numCart",getNumCart());
            startActivity(intent);

        }else if(view == segundo){
            Intent intent = new Intent(this, MuestraCartas.class);
            intent.putExtra("numCart",getNumCart());
            //startActivity(intent);

            // startActivity(intent);

            startActivityForResult(intent, REQUEST_CODE);
        }else if(view == tercero){
            Intent intent = new Intent(this, MuestraCartas.class);
            intent.putExtra("numCart",getNumCart());
            startActivity(intent);
        }
    }

   /* @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.checkBox:
                numCart = 6;
                Button Calcularbtn = (Button) findViewById(R.id.checkBox);
                Calcularbtn.setOnClickListener(this);
                enviadificult(numCart);
                break;
            case R.id.checkBox2:
                numCart = 12;
                Button Calcularbtn2 = (Button) findViewById(R.id.checkBox2);
                Calcularbtn2.setOnClickListener(this);
                enviadificult(numCart);
                break;
            case R.id.checkBox3:
                numCart = 24;
                Button Calcularbtn3 = (Button) findViewById(R.id.checkBox3);
                Calcularbtn3.setOnClickListener(this);
                enviadificult(numCart);
                break;
        }

    }
    private void enviadificult(int numCart) {
        Intent intent = new Intent(MainActivity.this, MuestraCartas.class);
        intent.putExtra("numCart",getNumCart());
        startActivity(intent);
    }*/
}
