package starpattern;

public class Pattern6 {

    public static void main(String[] args) {

        for (int a=1; a<=5; a++) {

            for (int b=1; b<=a; b++) {

                if (a>=2 && b<=a-1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("Reverse pattern.");

        for (int a=1; a<=5; a++) {

            for (int b=5; b>=a; b--) {
                System.out.print(" ");
            }
            for (int c=1; c<=a; c++) {

                if (a>=2 && c>1) {
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
