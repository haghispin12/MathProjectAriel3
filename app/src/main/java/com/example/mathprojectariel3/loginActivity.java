package com.example.mathprojectariel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
            }
        });

    }


}