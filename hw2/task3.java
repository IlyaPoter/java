import java.util.Scanner;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        System.out.printf("Итоговый массив = " + Arrays.toString(arrCheck()));
    }

    public static int[] arrCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        System.out.println("Введите значения массива: ");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (Math.abs(array[i])>=10 && Math.abs(array[i])<=99) {
                sum+=i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (array[i] <0) {
                array[i]=sum;
            }
        }
        scanner.close();
        return array;
    }
}