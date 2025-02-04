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
    private Bitmap bitmap;


 public User( Long id, String name,int rate,Bitmap bitmap,int score){
     this.id=id;
     this.rate = rate;
     this.score=score;
     this.bitmap=bitmap;

 }
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

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
