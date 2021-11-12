package com.company;

import java.util.Scanner;

public class powerOfFour {
    //girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
    public static void main(String[] args) {
        int k;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        k=s.nextInt();
        for(int i=1; i<=k; i *=4 ){
            System.out.println(i);
        }
    }
}
