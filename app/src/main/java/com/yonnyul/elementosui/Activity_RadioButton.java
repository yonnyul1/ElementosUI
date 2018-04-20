package com.yonnyul.elementosui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_RadioButton extends AppCompatActivity {

    RadioGroup rdGroup;
    RadioButton rbF, rbM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__radio_button);

        rdGroup = findViewById(R.id.rdGroup);
        rbF = findViewById(R.id.rbF);
        rbM = findViewById(R.id.rbM);


    }


    public void onRadioButtonClicked(View view){
        boolean checked=((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rbF:
                if(checked)
                    Toast.makeText(getApplicationContext(),"Femenino",Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rbM:
                if(checked)
                    Toast.makeText(getApplicationContext(),"Masculino",Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
