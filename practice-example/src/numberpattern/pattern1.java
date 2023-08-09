package numberpattern;

public class pattern1 {

    public static void main(String[] args) {

        for (int a=1; a<=5; a++) {

            for (int b=1; b<=a; b++) {

                System.out.print(b);
            }
            System.out.println();
        }

        System.out.println('\n' + "program for n number in line for n number of time.");
        for (int a=1; a<=5; a++) {

            for (int b=1; b<=a; b++) {

                System.out.print(a);
            }
            System.out.println();
        }
    }
}
