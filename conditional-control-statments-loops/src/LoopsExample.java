public class LoopsExample {
    public static void main(String[] args) {
        /* - print first 10 natural number
           - Loops-> use for repetitive operation
           -1. for
           -2. while
           -3. do while
           -4. advanced for loop
         */

        for (int i=1; i<=10; i++){
            //int i=1; -> initialization , i<=10; -> condition check, i++ -> increment
            System.out.println("i = " +i);
        }

        for (int i=10; i>=1; i--){
            //int i=10; -> initialization , i<=1; -> condition check, i++ -> decrement
            System.out.println("i = " + i);
        }


    }
}
