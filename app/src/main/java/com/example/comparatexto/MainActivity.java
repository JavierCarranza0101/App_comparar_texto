package com.example.comparatexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private TextView tv1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 =(TextView)findViewById(R.id.text_resultado);

    }

        public void resultado(View view){
            String txt1 = et1.getText().toString();
            String txt2 = et2.getText().toString();



            if(Objects.equals(txt1,txt2)){
                tv1.setText("Son Iguales");

            } else   {tv1.setText("Son Distintos");}





        }











}