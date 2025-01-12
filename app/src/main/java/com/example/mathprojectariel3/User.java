package com.example.mathprojectariel3;

import android.graphics.Bitmap;
import android.net.Uri;

public class User {
    private String name;
    private int score;
    private  int rate;
    private int image;
    private Uri uri;
    private long id;



    public   User(String name, int image,Uri uri,long id,int rate,int score ){
       this.image=image;
       this.name=name;
       this.uri=uri;
       this.id=id;
       this.rate = rate;
       this.score=score;


   }



    public  User(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
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
