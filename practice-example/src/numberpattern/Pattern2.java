package numberpattern;

public class Pattern2 {

    public static void main(String[] args) {

        int count= 0;

        for (int a=1; a<=5; a++) {

            for (int b=1; b<=a; b++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
