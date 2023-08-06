package starpattern;

public class Pattern5 {

    public static void main(String[] args) {

        System.out.println("Pattern by first method.");

        for (int i=1; i<=5; i++) {

            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k=4; k>=i; k--) {
                System.out.print("*");
            }
            for (int l=3; l>=i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pattern by 2nd method.");

        for (int i=1; i<=5; i++) {

            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k=9; k>(i*2); k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println( "Pattern by 3rd method.");

        for (int i=4; i>=1; i--) {

            for (int j=4; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<(i*2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
