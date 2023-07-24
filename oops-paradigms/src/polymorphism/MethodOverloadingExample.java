package polymorphism;

public class MethodOverloadingExample {
    /*
Polymorphism means Many forms of same item/thing.
It means method can have many forms

Types of Polymorphism
1. Static or compile time or overloading
   a- no of parameter can be different
   b- sequence of parameter ca be different
   c- type of parameter can be different
   Note- They can have any access level and return type but just having different access level or return type
   doesn't mean methods are overloaded.

2. Dynamic or run time or overriding
*/

        void displayMsg(){
            System.out.println("A method with no argument called.");
        }

        void displayMsg(String msg){
            System.out.println("A method with one parameter called with msg " + msg);
        }

        void displayMsg(int num){
            System.out.println("A method with one parameter called with num " + num);
        }

        void displayMsg(int num, String msg){
            System.out.println("A method with two params called with num " + num + " and msg " + msg);
        }

        void displayMsg(String msg, int num){
            System.out.println("A method with two params called with msg " + msg + " and num " + num);
        }


        public static void main(String[] args){
            MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
            methodOverloadingExample.displayMsg();
            methodOverloadingExample.displayMsg("Hi there!!!");
            methodOverloadingExample.displayMsg(101);
            methodOverloadingExample.displayMsg(111, "Hi There boys..!!");
            methodOverloadingExample.displayMsg("Hi There boys..!!",111 );

        }
    }

