package com.yonnyul.elementosui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1= findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        Button btn2= findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        Button btn3= findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        Button btn4= findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        Button btn5= findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1){
            Intent botones = new Intent(MainActivity.this, Activity_Botones.class);
            startActivity(botones);
        }

        if (v.getId() == R.id.btn2){
            Intent radio = new Intent(MainActivity.this, Activity_RadioButton.class);
            startActivity(radio);
        }

        if (v.getId() == R.id.btn3){
            Intent checkbo = new Intent(MainActivity.this, Activity_Checkbox.class);
            startActivity(checkbo);
        }

        if (v.getId() == R.id.btn4){
            Intent spinner = new Intent(MainActivity.this, Activity_Spinner.class);
            startActivity(spinner);
        }

        if (v.getId() == R.id.btn5){
            Intent lista = new Intent(MainActivity.this, Activity_Lista.class);
            startActivity(lista);
        }
    }


}
