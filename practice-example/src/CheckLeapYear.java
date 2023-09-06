import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {

        System.out.println("Check Leap Year...");

        //year to be checked
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year.");
        int year = scanner.nextInt();
        boolean leap = false;

        //if the year is divided by 4
        if (year % 4 == 0) {

            //if the year is century
            if (year % 100 == 0) {

                //if the year is divided by 400
                //then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            //if the year is not century
            else
                leap = false;

            if (leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not leap year.");
        }
    }
}
