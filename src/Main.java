public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i+1) {
            System.out.println(i);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            } else {
                System.out.println(i + " год является невисокосным");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 600; i = i*2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        int savingsAmount = 29000;
        int monthlyTotal = 0;
        for (int i = 0; i < 12; i++) {
            monthlyTotal = monthlyTotal + savingsAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + monthlyTotal + " рублей");
        }
    }
    public static void task9() {
        System.out.println("Задача 9");
        int savingsAmount = 29000;
        int savingAmountWithPenny = savingsAmount*100;
        int monthlySavings = 0;
        double total;
        for (int i = 0; i < 12; i++) {
            monthlySavings = monthlySavings + monthlySavings / 100;
            monthlySavings = savingAmountWithPenny + monthlySavings;
            total = monthlySavings;
            total = total/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        int two = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(two + "*" + i + "=" + two*i);
        }
    }
}
