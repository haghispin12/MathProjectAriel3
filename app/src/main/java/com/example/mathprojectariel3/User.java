package com.example.mathprojectariel3;

import android.graphics.Bitmap;

public class User {
    private String name;
    private int score;
    private  int rate;
    private int image;
   public   User(String name,int image){
       this.image=image;
       this.name=name;
   }







    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
