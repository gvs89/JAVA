package sem1;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        // ############################################

        // System.out.println(LocalDateTime.now());

        // ############################################

        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();
        // System.out.println("Привет, " + name + "!");
        // scanner.close();

        // ############################################

        // while (true) {
        // live();
        // }

        // }

        // public static void live() {
        // System.out.println("Сколько вам лет?");
        // Scanner scanner = new Scanner(System.in);
        // int age;
        // try {
        // age = scanner.nextInt();
        // if (age < 10) {
        // System.out.println("Вот вам конфетка :) ");
        // } else if (age < 18) {
        // System.out.println("Вот вам книга! ");
        // } else if (age < 70) {
        // System.out.println("Вот вам очки! ");
        // } else {
        // System.out.println("Вы прожили долгую жизнь... ");
        // }

        // } catch (InputMismatchException e) {
        // System.out.println("Вы ввели не число,пргорамма закрывается!");
        // System.exit(0);
        // }
        // #############################################//#endregion
        // int[] arr = {1,4,5,4,7,8};
        // // int[] arr1 = new int[]{1,4,5,4,7,8};
        // // int[] arr2 = new int[5];
        // // System.out.println(Arrays.toString(arr2));
        // // System.out.println(Arrays.toString(arr1));
        // // arr1[2] = 10;
        // // System.out.println(Arrays.toString(arr1));
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // }
        // System.out.println(sum);

        String str = "Добро пожаловать на курс по Java";
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            String temp = arr[i];
            sb.append(temp).append(" ");

        }
        System.out.println(sb);

    }

}

class Answer {
    public void printPrimeNums() {
        boolean isPrime;
        for (int i = 1; i < 1000; i++) {
            isPrime = i == 1;
            for (int j = 2; j < 1000; j++) {
                if (i >= j && i % j == 0) {
                    if (j == i) {
                        isPrime = true;
                    }
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}