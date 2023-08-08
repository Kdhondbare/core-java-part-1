package starpattern;

public class Pattern8 {

    public static void main(String[] args) {

        for (int a=0; a<5; a++) {

            for (int b=0; b<5; b++) {
                if (a==b || a+b==5-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
