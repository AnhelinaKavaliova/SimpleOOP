package Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mikita", "Software-engineer", 2000 );
        Employee employee2 = new Employee("Nikita", "Software-engineer", 1500 );
        Employee employee3 = new Employee("Nik", "Software-engineer", 1000 );

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
    }
}
