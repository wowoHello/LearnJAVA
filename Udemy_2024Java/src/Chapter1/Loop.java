package Chapter1;

public class Loop {
    public static void main(String[] args) {
        // for迴圈，已知執行次數時
        String[] friends = {"Wilson", "Jay", "Howlen"};
        for (int i =0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }

        // while迴圈，不知道執行次數時
        int i = 0;
        while (i < 10) {
            System.out.println("The value is " + i);
            i++;
        }

        // 巢狀迴圈
        for (int a = 0; a < 10; a++) {
            for (int j = 3; j >= 0; j--) {
                System.out.println(j);
            }
        }
    }
}
