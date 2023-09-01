public class Driver {

    public static void main(String[] args) {

        Student student1 = new Student("Karan", 100, 24);

        Student student2 = new Student("Karan", 100, 24);

        Student student3 = new Student("Karan", 100, 25);

        Student student4 = student1;

        Employee employee = new Employee("Karan", 100, 25);



        System.out.println(student1.equals(student2));//true

        System.out.println(student1.equals(student3));//false

        System.out.println(student1.equals(employee));//false

        System.out.println(student1.equals(student4));

        System.out.println("HashCode for student1 is : " + student1.hashCode());
        System.out.println("Karan hashcode is : " + "K".hashCode());
        System.out.println("Karan hashcode is : " + "Ka".hashCode());
        System.out.println("Karan hashcode is : " + "Kar".hashCode());
    }
}
