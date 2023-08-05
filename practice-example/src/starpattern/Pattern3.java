package starpattern;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("Pattern by first method.");

        for (int i=1; i<=5; i++) {

            for (int j=5; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Pattern by second method.");

        for (int i=1; i<=5; i++) {

            for (int j=5; j>=1; j--) {

                if (j>i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
