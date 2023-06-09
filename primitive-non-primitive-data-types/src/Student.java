/*
Class is a user defined data or Non-primitive data type
or it is a blueprint for the objects

class Student

#Student properties
    name - Sting
    age - int
    id - int
    div - char
    collegeName - string

#Student behaviour/action
    Study()
    play()
    commute()

 */
public class Student {

    // Properties or fields or attributes

    String name;
    int age;
    int id;
    char div;
    String collegeName;

    // Methods or behaviour or actions

    void study(){
        System.out.println(this.name + " is studying.");
    }

    void play(){
        System.out.println(this.name + " is playing.");
    }

    void commute(){
        System.out.println(this.name + " is commuting.");
    }

}

class Example{

    public static void main(String[] args) {
        // Object is an entity of class

        //fields for nikhil
        Student nikhil= new Student();
        nikhil.name = "Nikhil";
        nikhil.id = 111;
        nikhil.div = 'B';
        nikhil.age = 23;
        nikhil.collegeName = "Vishwakarma Institute of Technology";

        //methods for nikhil
        nikhil.study();
        nikhil.play();
        nikhil.commute();
    }
}
