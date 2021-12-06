package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        common();

        task4();

        task5();

        task6();

        task7();

        task8();

        task9();

    }

    public static void common() {
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.println("Максимальная cумма трат за месяц составила " + max + " рублей");
        System.out.println("Минимальная cумма трат за месяц составила " + min + " рублей");

        float average = sum / (float) arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = "navI vonavI".toCharArray(); //мне было лень прописывать каждый символ :)

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            final int index = reverseFullName.length - 1 - i;
            final char tmp = reverseFullName[index];
            reverseFullName[index] = reverseFullName[i];
            reverseFullName[i] = tmp;
        }
        System.out.println(reverseFullName);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task5() {
        System.out.println("\n\tЗадача 5\n");

        int len = 3;
        int[][] matrix = new int[len][len];
        for (int i = 0; i < len * len; i++) {
            int col = i % len;
            int row = i / len;
            if ((i % (len + 1)) == 0 || (i % (len - 1)) == 0)
                matrix[col][row] = 1;
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        System.out.println("\n\tЗадача 6\n");

        int arr[] = {5, 4, 3, 2, 1};
        int len = arr.length;
        int newArr[] = new int[arr.length];

        for (int i = 0; i < len; i++)
            newArr[len - 1 - i] = arr[i];

        System.out.println("До преобразований: " + Arrays.toString(arr));
        // Copy back
        for (int i = 0; i < len; i++)
            arr[i] = newArr[i];
        System.out.println("После преобразований: " + Arrays.toString(arr));
    }

    public static void task7() {
        System.out.println("\n\tЗадача 7\n");

        // Не понимаю смысл этого задания, это же тоже самое, что и 4й задача?

        int arr[] = { 5, 8, 2, 3, 9 };
        int len = arr.length;
        System.out.println("До преобразований: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            final int index = arr.length - 1 - i;
            final int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }

        System.out.println("После преобразований: " + Arrays.toString(arr));
    }

    public static void task8() {
        System.out.println("\n\tЗадача 8\n");

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);

        int a = arr[0], j = arr.length - 1, b = arr[j];
        while(j >= 0 && b > 0 && (a + b) != -2) {
            b = arr[j--];
        }
        System.out.println(a + " + " + b + " = -2");
    }

    public static void task9() {
        System.out.println("\n\tЗадача 9\n");

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length && arr[i] < 0; i++) {
            int a = arr[i];
            for (int j = arr.length - 1; j >= 0 && arr[j] > 0; j--) {
                int b = arr[j];
                if(a + b == -2)
                    System.out.println(a + " + " + b + " = -2");
            }
        }
    }
}
