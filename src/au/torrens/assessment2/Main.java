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

    static int menu() {
        int opt = -1;

        while (opt < 0 || opt > 4) {
            System.out.println("Select one of the following operations");
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");

            opt = (int) input("Enter your choice >>> ");
        }

        return opt;
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

        boolean run = true;

        while(run) {
            double a = input("Enter a number >>>");
            double b = input("Enter another number >>>");
            int opt = menu();
            switch (opt) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    diff(a, b);
                    break;
                case 3:
                    mul(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                case 0:
                    run = false;
                    break;
            }
        }
        System.out.println("Goodbye!");
    }
}
