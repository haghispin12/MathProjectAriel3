package com.example.mathprojectariel3;

import static android.app.Activity.RESULT_OK;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class FragmentUsers extends Fragment {
        MainViewModel mainViewModel;
        private EditText user;
        private Button addpic;
        private Button adduser;
        private TextView rate23;
        private TextView score;
        private EditText etUsrename;
        private RecyclerView rcShowUsers;
        Uri uri;
        ImageView pic1;

        ActivityResultLauncher<Intent>startCamera=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode()==RESULT_OK){
                         pic1.setImageURI(uri);
                        mainViewModel.user.setUri(uri);
                        }

                    }
                }

        );


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_showusers, container, false);
        mainViewModel=new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        mainViewModel.users.observe(getActivity(), new Observer<ArrayList<User>>() {
            @Override
            public void onChanged(ArrayList<User> Users) {

                if (Users.size()>0){


                UserAdapter fa= new UserAdapter(Users,
                        new UserAdapter.OnItemClickListener() {

                            @Override
                            public void onItemClick(User item) {
                                int n = 10;

                            }

                        });
                    rcShowUsers.setLayoutManager(new LinearLayoutManager(requireActivity()));
                    rcShowUsers.setAdapter(fa);
                    rcShowUsers.setHasFixedSize(true);

            }
            }
        });

        initview(view);


        mainViewModel.dbSelectAll(requireActivity());

        return view;
    }


    private void initview(View view) {
        etUsrename=view.findViewById(R.id.etUsrename);
        etUsrename.setText(mainViewModel.VgetName());
        adduser=view.findViewById(R.id.adduser);
        rate23=view.findViewById(R.id.rate23);
        score=view.findViewById(R.id.score);
        pic1=view.findViewById(R.id.ivProfileImage);
        score.setText("score"+mainViewModel.vgetscore()+"");
        rate23.setText("rate"+mainViewModel.vgetrate()+"");
        rcShowUsers=view.findViewById(R.id.rcShowUsers);

       adduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getActivity()!=null){
                    long id=mainViewModel. dbAddUser(getActivity());
                    Toast.makeText(getActivity(),"insert row id"+id,Toast.LENGTH_LONG).show();
                }
            }
        });
           //create all editext and id and conect mainviewmodel value
              addpic=view.findViewById(R.id.picture);
          addpic.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  ContentValues values=new ContentValues();
                  values.put(MediaStore.Images.Media.TITLE,"New Picture");
                  values.put(MediaStore.Images.Media.DESCRIPTION,"From Camera");
                  uri=
                          requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,values);
                            Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT,uri);
                            startCamera.launch(cameraIntent);
              }
          });





    }
    }


//  ad20.setOnClickListener(new View.OnClickListener() {