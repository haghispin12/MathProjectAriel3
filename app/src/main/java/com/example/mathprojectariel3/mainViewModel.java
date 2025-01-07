package com.example.mathprojectariel3;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

  public class mainViewModel extends ViewModel {
    MutableLiveData<Integer> Vnum1;
    MutableLiveData<Integer> Vnum2;
    Exercise exercise;
    User user;
    public mainViewModel(){
        Vnum1=new MutableLiveData<>();
        Vnum2=new MutableLiveData<>();
        exercise=new Exercise();
        user=new User();
    }
    public void VupdateName( String un){
        user.setName(un);





    }
    public String VgetName(){
        return user.getName();
    }
    public void VupdateRate(int rate){
        user.setRate(rate);
    }





        public void vChalenge(){
            exercise.generatenumsetgar();
            Vnum1.setValue(exercise.getNum1());
            Vnum2.setValue(exercise.getNum2());
        }
        public void Ad20(){
            exercise.generatenumsad20();
            Vnum1.setValue(exercise.getNum1());
            Vnum2.setValue(exercise.getNum2());

        }
        public void loach(){
            exercise.generatenumsloach();
            Vnum1.setValue(exercise.getNum1());
            Vnum2.setValue(exercise.getNum2());
        }
        public Boolean check(String str1){
            return exercise.test(str1);
        }

        public MutableLiveData<Integer> getVnum1() {
            return Vnum1;
        }

        public MutableLiveData<Integer> getVnum2() {
            return Vnum2;
        }

        public void setVnum1(MutableLiveData<Integer> vnum1) {
            Vnum1 = vnum1;
        }

        public void setVnum2(MutableLiveData<Integer> vnum2) {
            Vnum2 = vnum2;
        }
      public long  dbAddUser(Context context){
          DBHelper dbHelper=new DBHelper(context);
          long id=dbHelper.insert(user,context);
          Log.d("userId",id+"");
          return id;

      }
    }
