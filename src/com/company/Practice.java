package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        int k =0;
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum = sum +i ;
                k++;
            }
        }
        System.out.println("ortalama" +(sum/k));
    }
}
