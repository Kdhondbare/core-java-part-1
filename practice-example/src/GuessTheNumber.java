import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses;

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    void Game (){
        Random r = new Random();
        this.number = r.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess The Number");
        Scanner s = new Scanner(System.in);
        inputNumber = s.nextInt();

    }
    boolean isCorrectNumber(int num){
        if(num == number){
            return true;
        } else if (num<number) {
            System.out.println("Too less....");
        }else if (num>number) {
            System.out.println("Too high....");
        return false;

    }

}


public class GuessTheNumber {

    public static void main(String[] args) {

        Game g = new Game();
        g.takeUserInput();
        boolean b = g.isCorrectNumber()
    }


}
