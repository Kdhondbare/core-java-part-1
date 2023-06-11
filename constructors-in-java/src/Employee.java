public class Employee {
    //attributes or fields

    String name;
    int id;
    String address;
    long phoneNum;
    int salary;
    String gender;
    String company;

    //Constructors- constructs the objects, basically initializes the objects.
    /*
    1. Constructor name must be same as class name.
    2. Constructor does not have any return type.
    3. Constructors can have parameters.
    4. Constructor does not return any value.
     */

    // No argument constructor

    Employee(){
        System.out.println("*************************");
        System.out.println("No argument constructor called");
        this.name = "Sahil";
        this.id = 111;
        this.address = "1A Pune";
        this.phoneNum = 1208796326;
        this.salary = 450000;
        this.gender = "Male";
        this.company = "Accenture";
        System.out.println("**************************");

    }

    Employee(String name, int id){
        this("Pune", 23352003, 35000);
        this.name = name;
        this.id = id;
    }

    Employee(String address, long phoneNum, int salary){
        this("Male", "Infoys");
        this.address = address;
        this.phoneNum = phoneNum;
        this.salary = salary;
    }

    Employee(String gender, String company){
        this.gender = gender;
        this.company = company;
    }


    //Parameterized constructor
    Employee(String name, int id, String address, int phoneNum, int salary, String gender, String company){
        System.out.println("*********************");
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.gender = gender;
        this.company = company;
        System.out.println("*********************");


    }
    //Copy constructor - copy fields from one object to other object
    Employee(Employee employee){
        this.name = employee.name;
        this.id = employee.id;
        this.address = employee.address;
        this.phoneNum = employee.phoneNum;
        this.salary = employee.salary;
        this.gender = employee.gender;
        this.company = employee.company;

    }

    void displayObjectsAndMessage(){
        System.out.println("Hello "+ this.name);
        System.out.println(this.id + "\n" + this.salary + "\n" + this.address + "\n" + this.phoneNum + "\n" + this.gender +"\n" + this.company);
    }

}

