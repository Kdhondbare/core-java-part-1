package inheritance.typesofInheritance.hybrid;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Running class A");
        A a = new A();
        a.helloFromA();

        System.out.println('\n' + "Running class B which inherited class A");
        B b = new B();
        b.helloFromB();
        b.helloFromA();


        System.out.println('\n' + "Running class C which inherited class A");
        C c = new C();
        c.helloFromC();
        c.helloFromA();

        System.out.println('\n' + "Running class D which inherited class B");
        D d = new D();
        d.helloFromD();
        d.helloFromB();
        d.helloFromA();
    }
}
