package au.torrens.assessment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static double input(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("msg");
        Double val = null;
        while (val == null) {
            try {
                val = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Input was invalid. Try again: ");
                sc.next(); // skip the invalid input
            }
        }

        return val;
    }

    static void sum(double a, double b) {
        System.out.println("The sum is >>> " + (a+b));
    }

    static void diff(double a, double b) {
        System.out.println("The difference is >>> " + (a-b));
    }

    static void mul(double a, double b) {
        System.out.println("The product is >>> " + (a*b));
    }

    static void div(double a, double b) {
        System.out.println("The quotient is >>> " + (a/b));
    }

    public static void main(String[] args) {

	    System.out.println("Simple Calculator");
        double a = input("Enter a number >>>");
        double b = input("Enter another number >>>");

        sum(a, b);
        diff(a, b);
        mul(a, b);
        div(a, b);
    }
}
