package Chapter2;

public class People {
    protected String name;
    protected int age;
    protected String address;

    public People(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void sleep() {
        System.out.println("Sleep...");
    }
}
