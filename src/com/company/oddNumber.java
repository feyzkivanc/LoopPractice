package com.company;

import java.util.Scanner;

public class oddNumber {
    public static void main(String[] args) {
        //tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
        Scanner scan = new Scanner(System.in);
        int n;
        int sum=0;
        do{
            System.out.println("enter a number");
            n= scan.nextInt();
            if(n % 2== 0 || n % 4==0){
                sum += n;
            }
        }while(n %2 ==0 );
        System.out.println(sum);

    }
}
/*
       //negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
       girilen değerlerden tek sayıları toplayıp ekrana basan program



        do{
            System.out.println("enter a number:");
            n= scan.nextInt();
            if(n%2==1) {
                sum += n;
                System.out.println(sum);
            }
        }while(n>0);
        System.out.println(sum); */