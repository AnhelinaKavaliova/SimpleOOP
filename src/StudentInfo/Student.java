package StudentInfo;

public class Student extends Person {
    private int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void study(){
        System.out.println("I'm in the "+ grade +"th grade");
    }
}
