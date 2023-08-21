package immutable;

public class Driver {

    public static void main(String[] args) {

        Address address = new Address(110, "Nandurkhi Road", "Shirdi", 423109);
        // address = 5000h
        Employee employee = new Employee(421, 500000, "Sahil", address);

        System.out.println(employee);
        address.setLineNum(123);
        System.out.println(employee);
        employee.getAddress().setLineNum(200);
        System.out.println(employee);
    }
}
