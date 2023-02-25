package org.example.seminar1.cw1;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println(runningSum());

    }


    public static int[] runningSum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] resArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        resArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            resArray[i] = arr[i] + resArray[i-1];
        }
        for (int i = 0; i < resArray.length; i++) {
            System.out.println(resArray[i]);
        }
        return null;
    }
}