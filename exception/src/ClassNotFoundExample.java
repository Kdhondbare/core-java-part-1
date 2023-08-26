class Hello {
    void display() {
        System.out.println("Hello from Hello class..");
    }
}

public class ClassNotFoundExample {
    public static void main(String[] args) {
        System.out.println(Hello.class);
        //System.out.println(Hello1.class);
    }
}
