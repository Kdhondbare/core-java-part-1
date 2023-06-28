import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {
        //Read some strings or user input from console
        //read-write - input and output
        System.out.println("Please enter an input: ");
        Scanner s = new Scanner(System.in);
        String dayOfWeek = s.next();

        switch (dayOfWeek){
            case "Monday" :
                System.out.println("Mondays are worst..");
                break;
            case "Tuesday" :
                System.out.println("Tuesdays are okay okay..");
                break;
            case "Wednesday" :
                System.out.println("Wednesdays are average..");
                break;
            case "Thursday" :
                System.out.println("Thursdays are better..");
                break;
            case "Friday" :
                System.out.println("Fridays, when the fun begins..");
                break;
            case "Saturday" :
                System.out.println("Saturdays, the first day of weekend and is the best day..");
                break;
            case "Sunday" :
                System.out.println("Sunday is the fun day till the evening..");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
