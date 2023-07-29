package inheritance.upcastingAndDownCasting;

public class Driver {

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.startup();
        machine.shutDown();

        Laptop laptop = new Laptop();
        laptop.startup();
        laptop.doProgramming();
        laptop.shutDown();

        Printer printer = new Printer();
        printer.startup();
        printer.printing();
        printer.shutDown();

        //Machine is  Reference    And   created object of laptop: LHS(Reference) = RHS(Object)
        /*
        In upcasting you create an object of child class and
        assign it to a parent class reference variable
         */

        Machine laptop1 = new Laptop();//upCasting
        laptop1.startup();
        laptop1.shutDown();

        Machine printer1 = new Printer();
        printer1.startup();
        printer1.shutDown();

        /*
        In downCasting we create an object of parent class and assign it to child class
         */

        Laptop laptop2 = (Laptop) new Machine();
        laptop2.startup();
        laptop2.doProgramming();
        laptop1.shutDown();

    }
}
