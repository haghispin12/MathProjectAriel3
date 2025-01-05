package com.example.mathprojectariel3;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowUsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.show_users_users);
       RecyclerView rcShowFruits;
       rcShowFruits=findViewById(R.id.rcShowUsers);
        ArrayList<Fruit>fruits=new ArrayList<>();
        fruits.add(new Fruit ("banana",R.drawable.banana));
        fruits.add(new Fruit("apple",R.drawable.apple));
        fruits.add(new Fruit("orange",R.drawable.orange));
        fruits.add(new Fruit("lemon",R.drawable.lemon));
        fruits.add(new Fruit("grapes",R.drawable.grapes));
        fruits.add(new Fruit("fru",R.drawable.fru));


        FruitAdapter fruitAdapter= new FruitAdapter(fruits,
                new FruitAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(Fruit item) {
                        Toast.makeText(ShowUsersActivity.this,item.getName(),Toast.LENGTH_SHORT).show();
                    }



                });
        rcShowFruits.setLayoutManager(new LinearLayoutManager(this));
        rcShowFruits.setAdapter(fruitAdapter);
        rcShowFruits.setHasFixedSize(true);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}