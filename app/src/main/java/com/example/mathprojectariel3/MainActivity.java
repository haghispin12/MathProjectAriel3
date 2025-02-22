package com.example.mathprojectariel3;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button etgar;
    private Button ad20;
    private Button loach;
    private TextView firstrandom;
    private TextView secondrandom;
    private EditText enteranswer;
    private Button check;
    private Button save;
    private Button allpar;
    private MainViewModel viewModelMain;
    private Button Grate;


    ActivityResultLauncher<Intent> activityResultLauncher=registerForActivityResult(
        new ActivityResultContracts.StartActivityForResult(),
           new ActivityResultCallback<ActivityResult>() {
            public  void onActivityResult(ActivityResult result) {
                int myrate=result.getData().getIntExtra("rate",-1);
                viewModelMain.VupdateRate(myrate);
              Toast.makeText(MainActivity.this,myrate+ "",Toast.LENGTH_LONG).show();
               }


           });



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();

        Intent intent=getIntent();
        String username=intent.getStringExtra("UserName");
        Toast.makeText(MainActivity.this,username,Toast.LENGTH_LONG).show();
        viewModelMain=new ViewModelProvider(this).get(MainViewModel.class);
        viewModelMain.VupdateName(username);
        viewModelMain.Vnum1.observe(this, new Observer<Integer>() {
            @Override

            public void onChanged(Integer num1) {
                firstrandom.setText(num1+" ");
            }

        });
        viewModelMain.Vnum2.observe(this, new Observer<Integer>() {

            @Override

            public void onChanged(Integer num1) {
                secondrandom.setText(num1+" ");
            }

        });
    }


    public  void initview() {
        etgar = findViewById(R.id.etgar);
        ad20 = findViewById(R.id.ad20);
        loach = findViewById(R.id.loach);
        firstrandom = findViewById(R.id.firstrandom);
        secondrandom = findViewById(R.id.secondrandom);
        enteranswer = findViewById(R.id.enteranswer);
        save = findViewById(R.id.save);
        allpar = findViewById(R.id.allpar);
        check=findViewById(R.id.check);
        Grate=findViewById(R.id.rate);
        etgar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelMain.vChalenge();

            }

        });
        ad20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelMain.Ad20();

            }
        });
        loach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelMain.loach();

            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewModelMain.check(enteranswer.getText().toString())) {

                    Toast.makeText(MainActivity.this, "Sucssesfull", Toast.LENGTH_LONG).show();
                    viewModelMain.user.setScore(viewModelMain.point);
                } else
                    Toast.makeText(MainActivity.this ,"eror",Toast.LENGTH_LONG).show();

            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        allpar.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View v) {
//                Intent intent=new Intent (MainActivity.this,ShowUsersActivity.class);
//                startActivity(intent);
                FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                trans.add(R.id.Fshowallusers, new FragmentUsers());
                trans.commit();



            }
        });
        Grate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,RateActivity2.class);
               activityResultLauncher.launch(intent);

    }






});}}


