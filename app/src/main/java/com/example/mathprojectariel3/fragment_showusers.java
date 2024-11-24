package com.example.mathprojectariel3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class fragment_showusers extends Fragment {
        mainViewModel mainViewModel;
        private EditText user;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_showusers, container, false);


        initview(view);
       return view;

    }

    private void initview(View view) {
        user=view.findViewById(R.id.user1);
        user.setText(mainViewModel.VgetName());
           //create all editext and id and conect mainviewmodel value



    }
}