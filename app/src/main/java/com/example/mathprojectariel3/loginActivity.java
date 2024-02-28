package com.example.mathprojectariel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {
    private EditText username;
    private Button submit;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initview();
        SharedPreferences sh=getSharedPreferences("myname",MODE_PRIVATE);
        String s1= sh.getString("myname","");
        username.setText(s1);




    }
    public void initview(){
        username=findViewById(R.id.etUserName);
        submit=findViewById(R.id.btSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent= new Intent(loginActivity.this,MainActivity.class);
                intent.putExtra("UserName",username.getText().toString());
                startActivity(intent);
              SharedPreferences sharedPreferences=getSharedPreferences("myname", MODE_PRIVATE);
                SharedPreferences.Editor myEdit=sharedPreferences.edit();
                myEdit.putString("myname", username.getText().toString());
                myEdit.apply();

            }
        });

    }


}