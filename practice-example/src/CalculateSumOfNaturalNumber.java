import java.util.Scanner;

public class CalculateSumOfNaturalNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Sum of Natural Number Using For Loop.");
        System.out.println("Enter the number.");
        int num = s.nextInt();
        int sum = 0;

        for (int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("Sum = " + sum);

        System.out.println("**********************************");
        System.out.println("Sum of Natural Number Using While Loop");
        System.out.println("Enter the number2.");
        int num2 = s.nextInt();
        int a = 1, sum1 = 0;
        while (a <= num){
            sum1 += a;
            a++;
        }
        System.out.println("Sum = " + sum);
    }
}
