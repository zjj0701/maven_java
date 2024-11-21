import java.time.LocalDateTime;

public class Employee implements Comparable<Employee> {


    private int age;
    private String name;
    private LocalDateTime localDateTime;

    public Employee(int age, String name, LocalDateTime localDateTime) {
        this.age = age;
        this.name = name;
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Employee [id=" + age + ", name=" + name + ", time=" + localDateTime + "]";
    }
}
