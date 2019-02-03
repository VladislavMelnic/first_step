package com.somecompany.randomizer;
public class random {
 public  int random_number1;
    public void  Random_number (int a,int b){

        random_number1 = a + (int) (Math.random() * b);
     //System.out.println("1-ое случайное число: " + random_number1);
 }
   public int getrandom_number1(){
        return random_number1;
    }



}
