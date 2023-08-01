package multipleInheritance;
/*
Example of multiple inheritance where one class extends another class and at the same time implements
multiple interfaces.
 */
public class D extends A implements B , C {
    @Override
    void displayA() {
        System.out.println("Print D.");
        super.displayA();
    }

    @Override
    public void displayB() {
        System.out.println("Print B.");
    }

    @Override
    public void displayC() {
        System.out.println("Print C.");
    }
}
