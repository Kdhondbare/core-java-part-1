package mutable;

public class Driver {

    public static void main(String[] args) {

        Address address = new Address(191, "Panmala Road", "Shirdi", 423109);

        Employee employee = new Employee(111, 450000, "Karan", address);

        System.out.println(employee);
        employee.id = 121;
        employee.salary = 400000;
        address.pinCode = 411033;
        //here employee object's id and salary has changed, hence employee is mutable.
        //we can also change the address object's.
        System.out.println(employee);
    }
}
