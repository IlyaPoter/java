package org.example.seminar1.cw2;

import java.util.Scanner;

// Дан массив целых чисел. Найти количество пар соседних элементов вдвое больше второго
public class task3 {
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if(mass[i] == 2*mass[i+1]){
                k++;
            }
        }
        scanner.close();
        System.out.println("k= " + k);
    }
}
