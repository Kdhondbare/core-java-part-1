package polymorphism.overriding;
/*
Method overriding means having another method in child class with same signature.
Method overriding means providing different method definition.
What is same signature -
   - The number of parameters must be same
   - The sequence of parameters must be same
   - The type of parameters must be same

   Note - The return type can be same as parent method or subtype of parent method
        - The access level should be same or lower
        - For method overriding inheritance is must
 */
public class Cat extends Animal {

    @Override
    Cat walk() {
        System.out.println("Cat is walking..");
        return new Cat();
    }

    @Override
    void run(String msg) {
        System.out.println("Cat is running..");
    }
}
