package se.Lexicon.Nils_Leandersson;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        while (true) {
            String userSelection;

            print("Calculator");
            print("************************");
            print("Press A for Addition");
            print("Press S for Subtraction");
            print("Press D for Division");
            print("Press M for Multiplication");
            print("Press X to exit program");

            userSelection = getStringFromUser("Your choice: ").toLowerCase();

            if (userSelection.equals("x")) break;

            switch (userSelection) {
                case "a":
                    print(Addition(getDoubleFromUser("first term: "), getDoubleFromUser("second term: ")));
                    break;

                case "s":
                    print(Subtraction(getDoubleFromUser("minuend: "), getDoubleFromUser("subtrahend: ")));
                    break;

                case "d":
                    print(Division(getDoubleFromUser("dividend: "), getDoubleFromUser("divisor: ")));
                    break;

                case "m":
                    print(Multiplication(getDoubleFromUser("first factor: "), getDoubleFromUser("second factor: ")));
                    break;

                default:
                    print("Invalid selection");
                    break;
            }
            print("Press Enter to continue");
            getStringFromUser("");
        }
    }

    public static String Addition(double term1, double term2) {
        return "The sum of " + term1 + " and " + term2 + " is: " + (term1 + term2);
    }

    public static String Subtraction(double minuend, double subtrahend) {
        return "The difference of " + minuend + " and " + subtrahend + " is: " + (minuend - subtrahend);
    }

    public static String Division(double dividend, double divisor) {
        if (divisor != 0) {
            return "The quotient of " + dividend + " and " + divisor + " is: " + (dividend / divisor);
        } else {
            return "Division by zero is not allowed";
        }
    }

    public static String Multiplication(double factor1, double factor2) {
        return "The product of " + factor1 + " and " + factor2 + " is: " + (factor1 * factor2);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static String getStringFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static double getDoubleFromUser(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(getStringFromUser(prompt).trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Input was not a number");
            }
        }
    }
}
