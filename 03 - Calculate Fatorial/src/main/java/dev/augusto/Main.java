package dev.augusto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int result = new FactorialCalculator(5).GetResult();

        System.out.println("The result is: " + result);

        scanner.close();
    }
}