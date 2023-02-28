package org.example.seminar1.hw2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во чисел последовательности: ");
        int n = scanner.nextInt();
        int summ = 0;
        System.out.println("Введите последовательность: ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num == 1) {
                summ = summ;
            } else if (num == 2 || num == 3 || num == 5 || num == 7) {
                summ += num;
            } else if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
                summ += num;
            }
        }
        scanner.close();
        System.out.print("Сумма простых чисел последовательности равна:" + summ);
    }
}
