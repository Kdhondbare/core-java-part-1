import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String yesNo = "yes";

        while (yesNo.equalsIgnoreCase("Yes")) {
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
            int userInput = s.nextInt();
            Random random = new Random();
            int computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 ||
                    userInput == 2 && computerInput == 1) {
                System.out.println("You win..!!!");
            } else {
                System.out.println("Computer Win..!!!");
            }
            System.out.println("Do you want to continue : \n1. Yes\n2. No");
            yesNo = s.next();
        }
    }
}
