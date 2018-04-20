package com.yonnyul.elementosui;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Activity_Botones extends AppCompatActivity {

    ToggleButton tgButton;
    TextView lbMensaje;
    Switch swButton;
    TextView Mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__botones);



        tgButton = findViewById(R.id.tgButton);
        lbMensaje = findViewById(R.id.lbMensaje);

        tgButton.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                if(tgButton.isChecked()) {
                    lbMensaje.setText("Boton Toggle: ON");
                } else
                    lbMensaje.setText("Boton Toggle: OFF");
            }
        });

        Mensaje = findViewById(R.id.Mensaje);
        swButton = findViewById(R.id.swButton);
        swButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Mensaje.setText("Boton Switch: On");
                }else {
                    Mensaje.setText("Boton Switch: Off");
                }
            }
        });
    }

}
