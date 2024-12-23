package Chapter1;

// Array, ArrayList(可調整長度動態陣列)
// add(), size(), get(), collections.sort(), clear()

import java.util.ArrayList;
import java.util.Collections;

public class Learnarray {
    public static void main(String[] args) {

        String[] name = {"Mike", "Melly", "Joe", "Jay"};
        System.out.println(name);

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Jay");
        friends.add("Graye");
        friends.add("Wilson");
        friends.add("Merry");
        System.out.println(friends.size());
        System.out.println(friends);
        Collections.sort(friends);
        System.out.println(friends);
        friends.clear();
        System.out.println(friends);
    }
}
