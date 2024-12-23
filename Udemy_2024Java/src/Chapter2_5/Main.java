package Chapter2_5;

public class Main {
    public static void main(String[] args) {
        Person jay = new Person("Jay", 31);
        Person grace = new Person("Gracy", 25);
        jay.setSpouse(grace);
        grace.setSpouse(jay);
        jay.talk();
    }
}
