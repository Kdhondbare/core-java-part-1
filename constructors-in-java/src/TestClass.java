public class TestClass{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.displayObjectsAndMessage();

        Employee employee2 = new Employee();
        employee2.displayObjectsAndMessage();

        Employee employee3 = new Employee();
        employee3.displayObjectsAndMessage();

        Employee employee4= new Employee("Karan", 121, "Shirdi", 12365879, 30000, "Male", "Mahaindra");
        employee4.displayObjectsAndMessage();

        Employee employee5 = new Employee(employee4);
        employee5.displayObjectsAndMessage();

        Employee employee6 = new Employee("Akshay", 123);
        employee6.displayObjectsAndMessage();
     
    }

}
