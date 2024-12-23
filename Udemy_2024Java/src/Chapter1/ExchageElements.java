package Chapter1;

// 數值互換
// 使用 temp 暫存值
public class ExchageElements {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        int[] Array1 = {1, 2, 3, 4, 5, 6};
        int temparr = Array1[0];
        Array1[0] = Array1[3];
        Array1[3] = temparr;
        for ( int n : Array1) {
            System.out.print(n + " ");
        }
    }
}
