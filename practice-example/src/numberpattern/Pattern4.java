package numberpattern;

public class Pattern4 {

    public static void main(String[] args) {

        for (int a=1; a<=5; a++) {

            for (int b=1; b<=a; b++) {
                System.out.print(b + " ");
            }
            for (int c=a-1; c>=1; c--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
