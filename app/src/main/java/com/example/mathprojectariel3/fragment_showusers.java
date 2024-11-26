package com.example.mathprojectariel3;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class fragment_showusers extends Fragment {
        mainViewModel mainViewModel;
        private EditText user;
        private Button addpic;
        ActivityResultLauncher<Intent>startCamera=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode()==RESULT_OK){
                        //misson     7 how to define the camera on frigment botton
                        }

                    }
                }

        )
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_showusers, container, false);
        mainViewModel=new ViewModelProvider(requireActivity()).get(mainViewModel.class);

        initview(view);
       return view;

    }


    private void initview(View view) {
        user=view.findViewById(R.id.user1);
        user.setText(mainViewModel.VgetName());
           //create all editext and id and conect mainviewmodel value
              addpic=view.findViewById(R.id.picture);
          addpic.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

              }
          });



    }
    }

//  ad20.setOnClickListener(new View.OnClickListener() {