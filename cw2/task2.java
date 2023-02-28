package org.example.seminar1.cw2;
// дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        int n = scanner.nextInt();
        System.out.println("number: ");
        int num = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if(num%2 == 0 && num2%10 == 5){
                summ += num2;
            }
            num = num2;

        }
        scanner.close();
        System.out.println(summ);
    }
}
