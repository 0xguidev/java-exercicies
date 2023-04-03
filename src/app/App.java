package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Number;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of numbers:");
        int n = sc.nextInt();
        Number[] numbers = new Number[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter the number:");
            numbers[i] = new Number(sc.nextInt());
        }

        System.out.println("Negative numbers");
        for (int i = 0; i < n; i++) {
            if (numbers[i].isNegative()) {
                System.out.println(numbers[i].getValue());
            }
        }

        sc.close();
    }
}
