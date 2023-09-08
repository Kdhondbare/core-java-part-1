import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number.");
        int number = s.nextInt();
        int t1 = number;
        int length = 0;
        while (t1 != 0) {
            length = length + 1;
            t1 = t1/10;
        }
        int t2 = number;
        int arm = 0;
        int remainder;

        while (t2 != 0) {
            int multiply = 1;
            remainder = t2 % 10;
            for (int i=1; i<=length; i++) {
                multiply = multiply*remainder;
            }
            arm = arm + multiply;
            t2 = t2/10;
        }
        if (arm == number) {
            System.out.println(number + " is armstrong number.");
        } else {
            System.out.println(number + " is not armstrong number.");
        }
    }
}
