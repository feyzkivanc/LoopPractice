package com.company;
 /*int sum=1;
         for(int i=1; i<=5; i++){
         sum = sum*i;
         }*/
public class Application {
    public static void main(String[] args){

        int n=5;
        int k=3; int total=1;
        for(int i=1;i<=k; i++){
            total *= n;
        }
        System.out.println(total);
    }
}
