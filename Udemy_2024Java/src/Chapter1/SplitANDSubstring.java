package Chapter1;

public class SplitANDSubstring {
    public static void main(String[] args) {
        String s = "Hello, Here is split & Substring learning.";
        String[] myArr = s.split(" ");
        for (String small : myArr) {
            System.out.println(small);
        }
        s = s.substring(1, 6);
        System.out.println(s);
    }
}
