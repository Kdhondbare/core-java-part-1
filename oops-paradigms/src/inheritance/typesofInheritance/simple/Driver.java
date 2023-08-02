package inheritance.typesofInheritance.simple;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Running class A.");
        A a = new A();
        a.helloFromA();

        System.out.println('\n' + "Running class B.");
        B b = new B();
        b.helloFromB();
        b.helloFromA();
    }
}
