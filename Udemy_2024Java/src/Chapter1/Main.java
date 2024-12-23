package Chapter1;

import java.util.Arrays;

public class Main {
    // 練習題 - 入門
    // 編寫一個名為“printEvery3()”的函數，它打印出等差數列 1, 4, 7, …, 88。
    public static void printEvery3() {
        for (int i = 1; i <= 88; i += 3) {
            System.out.println(i);
        }
    }

    // 編寫一個名為“ninetable()”的函數，它打印出九九乘法表的內容。
    public static void ninetable() {
        for (int i = 1; i < 10; i++) {
            for ( int j = 1; j < 10; j++) {
                int value = i * j;
                System.out.print("" + j + "*" + i + "=" + value + " ");
            }
            System.out.println("");
        }
    }

    // 編寫一個名為"findMax()”的函數，參數為一個array of Integers，return type為int，返回的值為array當中所有元素當中，最大的那個。
    public static void findMax() {
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        System.out.println(Arrays.stream(array).max().getAsInt());
    }

    // 編寫一個名為"reverseArray()”的函數，參數為一個array of Integers，return type為int[]，返回的值為將array of Integers全部反轉後的新array。
    public static void reverseArray() {
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        for (int value : reversedArray) {
            System.out.println(value);
        }
    }

    // 編寫一個名為"addUpTo()”的函數，參數為一個整數n，return type為int，return應為 1 + 2 + 3 + … + (n - 1) + n的值。
    public static void addUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum += i;
            if (i == n) {
                System.out.print(i + " = " + sum);
            } else {
                System.out.print(i + " + ");
            }
        }
    }

    // 編寫一個名為“position()”的函數，input為String。函數沒有任何return type，但需要打印出第一個大寫字母及其index位置。 如果未找到，則打印 -1。
    public static void position() {
        char var2 = 'b';
        System.out.println(var2);
    }

    public static void main(String[] args) {
//        printEvery3();
//        ninetable();
//        findMax();
//        reverseArray();
//        addUpTo(5);
        position();
    }
}