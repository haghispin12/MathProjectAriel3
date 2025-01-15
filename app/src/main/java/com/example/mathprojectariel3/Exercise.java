package com.example.mathprojectariel3;

import java.util.Random;

public class Exercise {
    public int num1;
    public int  num2;


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }



    public void generatenumsetgar (){
        Random r=new Random();
        num1=r.nextInt(10);
        num2=r.nextInt(90)+10;
    }


    public void generatenumsloach (){
        Random r=new Random();
        num1=r.nextInt(8)+1;
        num2=r.nextInt(8)+1;
    }
    public void generatenumsad20 (){
        Random r=new Random();
        num1=r.nextInt(10);
        num2= r.nextInt(10)+10;
    }
   public boolean test (String enteranswer){
        String num3=num1*num2+"";
        if(enteranswer.equals(num3))

            return true;
        else
            return false;
   }




}
