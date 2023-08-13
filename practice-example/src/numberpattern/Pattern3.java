package numberpattern;

public class Pattern3 {

    public static void main(String[] args) {

        for (int a=1; a<=5; a++) {

            for (int b=a; b>=1; b--) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
