import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();
        int temp = number;
        int reverse = 0, remainder;

        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp/10;
        }
        if (number == reverse) {
            System.out.println(number + " is palindrome number.");
        } else {
            System.out.println(number + " is not palindrome number.");
        }
    }
}
