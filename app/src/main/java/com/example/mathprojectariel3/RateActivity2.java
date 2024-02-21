package com.example.mathprojectariel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class RateActivity2 extends AppCompatActivity {
    private Button save;
    private SeekBar s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate2);
        initview();
    }

    public void initview() {
        save = findViewById(R.id.save);
        s1 = findViewById(R.id.s1);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inn = new Intent();
                inn.putExtra("rate", s1.getProgress());
                setResult(RESULT_OK, inn);
                finish();
            }

        });
    }
}



