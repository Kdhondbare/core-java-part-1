import java.util.ArrayList;
import java.util.List;

public class ListExampleInJava5 {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        guestList.add("Komal");
        guestList.add("Arti");
        guestList.add("Bhagyashree");
        guestList.add("Karan");
//        guestList.add(100);
//        guestList.add(10.5);

        for (String name : guestList) {
            System.out.println("My guest : " + name);
        }
        
        List<Integer> primeNum = new ArrayList<>();
        primeNum.add(2);
        primeNum.add(3);
        primeNum.add(5);
//        primeNum.add("Vikram");

        for (int i : primeNum) {
            System.out.println("Prime number i : " + i);
        }
    }
}
