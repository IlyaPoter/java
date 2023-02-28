import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        if (isCheck() == true) {
            System.out.println("Введенная последовательность возрастает");
        } else {
            System.out.println("Введенная последовательность НЕ возрастает");
        }
    }

    public static boolean isCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество значений последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Введите значения последовательности: ");
        boolean flag = true;
        int num1 = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                flag = false;
            }
            num1 = num2;
        }
        scanner.close();
        return flag;
    }
}