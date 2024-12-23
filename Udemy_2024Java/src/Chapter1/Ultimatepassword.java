package Chapter1;

// JAVA終極密碼
import java.util.Random;
import java.util.Scanner;

public class Ultimatepassword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 0;
        int max = 100;
        Random r = new Random();
        int secret = r.nextInt(max - min) + min;
        System.out.println("The secret number is: " + secret);

        while(true) {
            System.out.println("請輸入一個在" + min + "到" + max + "的數字： ");
            int guess = s.nextInt();
            
            if (guess == secret) {
                System.out.println("恭喜你答對囉！");
                break;
            } else if (guess > min && guess < secret) {
                min = guess;
            } else if (guess > secret && guess < max) {
                max = guess;
            } else {
                System.out.println("請輸入有效的數字！");
            }
        }
    }
}
