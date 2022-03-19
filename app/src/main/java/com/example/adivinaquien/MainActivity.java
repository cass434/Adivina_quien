package com.example.adivinaquien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button boton_si;
    ImageView caja_Imagen;
    int estadoBoton;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        estadoBoton = 1;
        caja_Imagen=findViewById(R.id.imagen);
        caja_Imagen.setImageResource(R.drawable.aleman);
        boton_si=findViewById(R.id.si);


    }

    public void pulsarBoton (View view){
        switch (estadoBoton){
            case 1:
                caja_Imagen.setImageResource(R.drawable.aleman);

                estadoBoton=2;
                contador++;
                break;
            case 2:
                caja_Imagen.setImageResource(R.drawable.selena_gomez);

                estadoBoton=3;
                contador++;
                break;
            case 3:
                caja_Imagen.setImageResource(R.drawable.ariana_grande);

                estadoBoton=4;
                contador++;
                break;
            case 4:
                caja_Imagen.setImageResource(R.drawable.bruno_mars);

                estadoBoton=5;
                contador++;
                break;
            case 5:
                caja_Imagen.setImageResource(R.drawable.matin_g);

                estadoBoton=1;
                contador++;
                break;

        }

    }
    public void pulsarno(View view){
        switch (estadoBoton){
            case 1:
                caja_Imagen.setImageResource(R.drawable.aleman);

                estadoBoton=2;
                contador--;
                break;
            case 2:
                caja_Imagen.setImageResource(R.drawable.selena_gomez);

                estadoBoton=3;
                contador--;
                break;
            case 3:
                caja_Imagen.setImageResource(R.drawable.ariana_grande);

                estadoBoton=4;
                contador--;
                break;
            case 4:
                caja_Imagen.setImageResource(R.drawable.bruno_mars);

                estadoBoton=5;
                contador--;
                break;
            case 5:
                caja_Imagen.setImageResource(R.drawable.matin_g);

                estadoBoton=1;
                contador--;
                break;

        }
    }
    public void onClick(View view) {
        //Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_LONG).show();
        Intent inte =new Intent(MainActivity.this,FinalActivity.class);
        inte.putExtra("Ok", txtNombre.getText().toString());
        startActivity(inte);

    }
}