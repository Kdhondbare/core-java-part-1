import java.util.Objects;

public class Student {

    String name;
    int id;
    int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }
    /*
    String name = "Karan" -> hashcode1 eg. 2000
    int id = 100 -> hashcode2 -> eg. 1000
    int age = 24 -> hashcode3 -> eg. 3000
    result = h1 + h2 + h3 -> student 1 ka hashcode.
    Student student1 = new Student("Karan", 100, 24)
     */
}
