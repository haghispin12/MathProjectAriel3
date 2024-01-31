package com.example.mathprojectariel3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button etgar;
    private Button ad20;
    private Button loach;
    private TextView firstrandom;
    private TextView secondrandom;
    private EditText enteranswer;
    private Button save;
    private Button  allpar;
    private Button check;
    private Exercise exercise;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
         exercise=new Exercise();

    }
    public void initview(){
        etgar=findViewById(R.id.etgar);
        ad20=findViewById(R.id.ad20);
        loach=findViewById(R.id.loach);
        firstrandom=findViewById(R.id.firstrandom);
        secondrandom=findViewById(R.id.secondrandom);
        enteranswer=findViewById(R.id.enteranswer);
        save=findViewById(R.id.save);
        allpar=findViewById(R.id.allpar);
        check=findViewById(R.id.check);


        etgar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               exercise.generatenumsetgar();
                updateview();

            }
        });
        ad20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              exercise .generatenumsad20();
                updateview();
            }
        });
        loach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise.generatenumsloach();
                updateview();

            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (exercise.test(enteranswer.getText().toString()))
                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_LONG).show();
                 else
                {
                     Toast.makeText(MainActivity.this, "error", Toast.LENGTH_LONG).show();

                 }
            }
        });

        allpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        /**
         * nums for etgar
         */

    }

    /**
     * showing nums in the game view
     */
    public void updateview (){
       firstrandom.setText(exercise.getNum1()+"");
       secondrandom.setText(exercise.getNum2()+"");
    }





}