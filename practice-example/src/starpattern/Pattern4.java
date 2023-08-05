package starpattern;

public class Pattern4 {

    public static void main(String[] args) {

        System.out.println("Pattern by first method.");
        for (int i=1; i<=5; i++) {

            for (int j=5; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            for (int l=2; l<=i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pattern by second method.");

        for (int i=1; i<=5; i++) {

            for (int j=5; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<(i*2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
