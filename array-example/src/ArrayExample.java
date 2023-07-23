public class ArrayExample {
    public static void main(String[] args) {
        int[] primeNums = new int [] {2,3,5,7};
        for (int num : primeNums){
            System.out.println(num);
        }

        String[] fruits = new String[] {"Apple", "Banana", "Grapes", "Pineapple", "Watermelon" };
        for (String nameOfFruit : fruits){
            System.out.println(nameOfFruit);
        }
    }
}
