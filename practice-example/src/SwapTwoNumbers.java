public class SwapTwoNumbers {
    public static void main(String[] args) {

        System.out.println("Swap two numbers using temporary variable..");
        float first = 1.20f, second = 2.45f;

        System.out.println("--Before Swap--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);

        //value of first is assigned to temporary
        float temporary = first;

        //value of second number assigned to first
        first= second;

        //value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After Swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        System.out.println("Swap two numbers without using temporary variable.." );

        float first1 = 10.0f , second2 = 30.5f;

        System.out.println("--Before Swap--");
        System.out.println("First number = " + first1);
        System.out.println("Second number = " + second2);

        first1 = first1 - second2;
        second2 = first1 + second2;
        first1 = second2 - first1;

        System.out.println("--After Swap--");
        System.out.println("First number = " + first1);
        System.out.println("Second number = " + second2);
    }
}
