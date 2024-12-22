package com.example.mathprojectariel3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowUsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.show_users_users);
       private  RecyclerView rcShowFruits;
       rcShowFruits=findViewById(R.id.rcShowUsers);
        ArrayList<Fruit>fruits=new ArrayList<>();
        fruits.add(new User("banana",R.drawable.banana));
        fruits.add(new User("apple",R.drawable.apple));
        fruits.add(new User("orange",R.drawable.orange));
        fruits.add(new User("lemon",R.drawable.lemon));
        fruits.add(new User("grapes",R.drawable.grapes));
        fruits.add(new User("fru",R.drawable.fru));



//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}