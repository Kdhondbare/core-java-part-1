
/*
1. Variables - Store a value, and it can change in the program
2. Constants - Value of constants doesn't change in the program -> final keyword
3. Conditional Statements - if and if else
4. Control Statements - switches
5. Loops -
 */


public class Examples {
    public static void main(String[] args) {
        int salary;
        int age = 24;
        salary = 35000;
        System.out.println("Salary : " + salary + ", Age : " + age);

        if (age > 18){
            System.out.println("You can drive.");
        } else {
            System.out.println("You are under 18 and cannot drive.");
        }

        if (salary > 50000){
            System.out.println("Your annual package is more than 6L");
        } else if (salary > 40000) {
            System.out.println("Your annual package is more than 4.8L");
        } else if (salary > 30000) {
            System.out.println("Your annual package is more than 3.6L");
        }else {
            System.out.println("Your annual package is less than 3.6L");
        }

        salary = 45000;
        System.out.println("Salary : " + salary + ", Age : " + age);

        final String dob = "29/02/1999"; // This "29/02/1999" is called string lateral and creates string object
        //Here dob is a constant and cannot be reassigned.
        System.out.println("Date of Birth : " + dob);
    }

}
