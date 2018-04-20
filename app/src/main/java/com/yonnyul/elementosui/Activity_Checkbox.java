package com.yonnyul.elementosui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Activity_Checkbox extends AppCompatActivity {

    private CheckBox opcionMostrar;
    private EditText campoClave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__checkbox);

        opcionMostrar = findViewById(R.id.chbMostrar);
        campoClave = findViewById(R.id.edtClave);

    }

    public void mostrarContrasena(View v){
        int cursor = campoClave.getSelectionEnd();
        if(opcionMostrar.isChecked()){
            campoClave.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);

        }else{
            campoClave.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }

        campoClave.setSelection(cursor);
    }
}
