import java.util.Scanner;

public class LoopsExample {


    public static void main(String[] args) {
        /* - print first 10 natural number
           - Loops-> use for repetitive operation
           -1. for
           -2. while
           -3. do while
           -4. advanced for loop
         */

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = 0;
//
//        try {
//            c=a/b;
//        }catch (ArithmeticException exception) {
//            System.out.println("Arithmetic exception occurred " + exception);
//        }
//        System.out.println("c = " + c);


        System.out.println("For loop example");
        for (int i=1; i<=10; i++){
            //int i=1; -> initialization , i<=10; -> condition check, i++ -> increment
            System.out.println("i = " +i);
        }

        System.out.println("For loop example");
        for (int i=10; i>=1; i--){
            //int i=10; -> initialization , i<=1; -> condition check, i++ -> decrement
            System.out.println("i = " + i);
        }


        System.out.println("While loop example");
        int i = 10;
        while (i>=1 /* condition checking */){
            System.out.println("i = " + i);
            i--;
        }

        System.out.println("do-while loop example");
        int j = 10;
        do{
            System.out.println("j= " +j);
            j--;
        }while (j>=1 /* condition checking */);



    }
}
