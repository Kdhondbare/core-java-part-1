package starpattern;

public class Pattern7 {

    public static void main(String[] args) {

        for (int a=1; a<=5; a++) {

            for (int b=4; b>=a; b--) {
                System.out.print(" ");
            }
            for (int c=1; c<(a*2); c++) {
                if (c>1 && c<(a*2)-1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("Reverse pattern.");

        for (int a=5; a>=1; a--) {

            for (int b=5; b>a; b--) {
                System.out.print(" ");
            }
            for (int c=1; c<(a*2); c++) {
                if (c>1 && c<(a*2)-1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
