//Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.
//        Пример: 1 2 1 2 -1 1 3 1 3 -1 0
//        2 -1 переход - 2 в сумму
//        3 -1 переход 3 в сумму
//        суммарно выведет 5

package org.example.seminar1.hw_1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int sum = 0;
        while(num1!=0) {
            int num2 = scanner.nextInt();
            if(num1>0 && num2<0){
                sum+=num1;
            }
            num1 = num2;
        }
        System.out.println(sum);
    }
}