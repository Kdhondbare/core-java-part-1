import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Calculator interface.");
       // System.out.println("Enter first number.");
        double no1= s.nextDouble();
        // System.out.println("Select symbol (+, -, /, *).");
        String symbol= s.next();
       // System.out.println("Enter second number.");
        double no2= s.nextDouble();
        double result;

        switch (symbol) {
            case "+" -> {
                result = no1 + no2;
                System.out.println(no1 + " + " + no2 + " = " + result);
            }
            case "-" -> {
                result = no1 - no2;
                System.out.println(no1 + " - " + no2 + " = " + result);
            }
            case "*" -> {
                result = no1 * no2;
                System.out.println(no1 + " * " + no2 + " = " + result);
            }
            case "/" -> {
                result = no1 / no2;
                System.out.println(no1 + " / " + no2 + " = " + result);
            }
            default -> System.out.println("Invalid symbol.");
        }

    }
}
