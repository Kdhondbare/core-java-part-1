import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 6};
        int expectedNumberElements = a.length + 1;
        int totalSum = expectedNumberElements * (expectedNumberElements + 1) / 2;
        //System.out.println(totalSum);

        int sum = 0;
        for (int i=0; i<a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Missing number is : " + (totalSum - sum));
    }
}
