package Chapter2;

public class Student extends People{
    private int grades;

    public Student(String name, int age, String address, int grades) {
        super(name, age, address);    //superclass
        this.grades = grades;
    }

    public void learn() {
        System.out.println("Learn...");
    }
}
