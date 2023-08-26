//Exception is abnormal behaviour in the program.
// When an exception occurs in program and it is not handled is not handled properly then
//the line below the exception do not get executed.

//Exceptions are of two types -
   //1. Compile time exception - these are thrown while compiling the program.
   //2. Run time exception - these exceptions are thrown when program is executed.

/*
   Exception is an abnormal condition in the program that causes the program to halt at point where the exception
   occurred but the exception can be handled and we can recover the application from exception.

   In exception hierarchy top level is Throwable
   Exception class extends Throwable.

   compile time exception -> IOException extends Exception
   compile time exception -> ClassNotFoundException extends Exceptions
   compile time exception -> FileNotFoundException extends Exceptions

   run time exception -> RuntimeException extends Exception

   ArithmeticException extends RunTimeException
   NullPointerException extends RunTimeException
   IndexOutOfBoundException
     //ArrayIndexOutOfBoundException
     //StringIndexOutOfBoundException
 */

public class ExceptionExample {

    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=a/b; // exception occurs here as / 0 is undefined, statements below this line will not be executed if exception not handled.
        System.out.println(c);
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }
    }
}
