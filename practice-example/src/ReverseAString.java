import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        System.out.println("Reverse a string program.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String...");
        String name = s.next();
        int length = name.length();
        String rev = "";
        for (int i=length-1; i>=0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse of " + name + " is " + rev);
    }
}
