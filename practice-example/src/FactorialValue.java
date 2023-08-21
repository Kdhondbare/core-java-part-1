import java.util.Scanner;

public class FactorialValue {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String yesNo = "1";
        while (yesNo.equalsIgnoreCase("1")) {
            System.out.println("Enter the number you want the factorial of :");
            long number = s.nextInt();
            long fact = 1;

            for (long a = number; a >= 1; a--) {

                fact = fact * a;
            }
            System.out.println("Factorial of number " + number + " is " + fact);
            System.out.println("Do you want to continue : \n1. Yes\n2. No");
            yesNo = s.next();
        }
    }
}