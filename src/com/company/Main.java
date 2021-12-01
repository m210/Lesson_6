package com.company;

public class Main {

    public static void main(String[] args) {
        common();

        task4();
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
           if(i > max)
               max = i;
           if(i < min)
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
}
