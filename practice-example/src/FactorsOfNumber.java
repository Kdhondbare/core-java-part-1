import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        System.out.println("Factors of Positive Number.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the positive number.");
        int posNum = s.nextInt();

        System.out.println("Factors of " + posNum + " are : ");

        for (int a=1; a<=posNum; a++) {

            if (posNum % a == 0) {
                System.out.print(a + ", ");
            }
        }

        System.out.println();
        System.out.println("Factors of Negative Number.");
        System.out.println("Enter the negative number.");
        int negNum = s.nextInt();

        System.out.println("Factors of " + negNum + " are : ");

        for (int b=negNum; b<=Math.abs(negNum); b++) {

            if (b==0) {
                continue;
            } else {
                if (negNum % b == 0) {
                    System.out.print(b + ", ");
                }
            }
        }
    }
}
