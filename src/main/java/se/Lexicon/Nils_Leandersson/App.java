package se.Lexicon.Nils_Leandersson;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        while (true) {
            String userSelection;

            print("Calculator");
            print("************************");
            print("Press A for Addition");
            print("Press AM for Addition of many terms");
            print("Press S for Subtraction");
            print("Press SM for Subtraction with many subtrahends");
            print("Press D for Division");
            print("Press M for Multiplication");
            print("Press X to exit program");

            userSelection = getStringFromUser("Your choice: ").toLowerCase();

            if (userSelection.equals("x")) break;

            switch (userSelection) {
                case "a":
                    print(Addition(getDoubleFromUser("First term: "), getDoubleFromUser("Second term: ")));
                    break;

                case "am":
                    print(AdditionArray(getDoubleArrayFromUser("Term: ")));
                    break;

                case "s":
                    print(Subtraction(getDoubleFromUser("Minuend: "), getDoubleFromUser("Subtrahend: ")));
                    break;

                case "sm":
                    print(SubtractionArray(getDoubleFromUser("Minuend: "), getDoubleArrayFromUser("Subtrahend: ")));
                    break;

                case "d":
                    print(Division(getDoubleFromUser("Dividend: "), getDoubleFromUser("Divisor: ")));
                    break;

                case "m":
                    print(Multiplication(getDoubleFromUser("First factor: "), getDoubleFromUser("Second factor: ")));
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

    public static String AdditionArray(double[] terms) {
        StringBuilder result = new StringBuilder();
        double sum = 0;

        result.append("The sum of ");

        for (double term : terms) {
            result.append(term);
            result.append(" ");
            sum += term;
        }

        result.append("is: ");
        result.append(sum);

        return result.toString();
    }

    public static String Subtraction(double minuend, double subtrahend) {
        return "The difference of " + minuend + " and " + subtrahend + " is: " + (minuend - subtrahend);
    }

    public static String SubtractionArray(double minuend, double[] subtrahends) {
        StringBuilder result = new StringBuilder();

        result.append("The difference of ");
        result.append(minuend);
        result.append(" and ");

        for (double subtrahend : subtrahends) {
            result.append(subtrahend);
            result.append(" ");
            minuend -= subtrahend;
        }

        result.append("is: ");
        result.append(minuend);

        return result.toString();
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

    public static double[] getDoubleArrayFromUser(String prompt) {
        double[] doublesFromUser = new double[0];

        print("Enter 0 to end input");

        while(true) {
            double doubleFromUser = getDoubleFromUser(prompt);

            if (doubleFromUser == 0) break;
            doublesFromUser = Arrays.copyOf(doublesFromUser, doublesFromUser.length + 1);
            doublesFromUser[doublesFromUser.length - 1] = doubleFromUser;
        }

        return doublesFromUser;
    }
}
