package au.torrens.assessment2;

import java.util.Scanner;

public class Main {

    static void sum(double a, double b) {
        System.out.println("The sum is >>> " + (a+b));
    }

    static void diff(double a, double b) {
        System.out.println("The difference is >>> " + (a-b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    System.out.println("Simple Calculator");
        System.out.println("Enter a number >>>");
        double a = sc.nextDouble();

        System.out.println("Enter a number >>>");
        double b = sc.nextDouble();

        sum(a, b);
        diff(a, b);
    }
}
