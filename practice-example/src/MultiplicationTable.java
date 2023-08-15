import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        String yesNo = "yes";
        while (yesNo.equalsIgnoreCase("Yes")) {
            System.out.println("Enter the number you want the multiplication table of :");
            int number = s.nextInt();

            for (int a = 1; a <= 10; a++) {
                System.out.println(number + "*" + a + " = " + number * a);
            }
            System.out.println("Do you want to continue : \n1. Yes\n2. No");
            yesNo = s.next();
        }
    }
}
