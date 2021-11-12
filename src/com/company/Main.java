package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scan.nextInt();

        for (int i = 0; i <= number; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
