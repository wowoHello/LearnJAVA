package Chapter1;

// Scanner(System.in) 輸入內容
// scanner.nextDouble() 等待輸入內容
// private static final DecimalFormat DF = new DecimalFormat("0.00") 取小數點後兩位

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMIcalculator {
    private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) {
        System.out.print("請輸入您的體重(公斤)： ");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.println("請輸入您的身高(公分)： ");
        double height = scanner.nextDouble() / 100;

        double bmi = Double.parseDouble(DF.format(weight / (height * height)));
        System.out.println("您的BMI值為：" + bmi);
        if (bmi < 18.5) {
            System.out.println("您屬於過輕類型");
        } else if (bmi < 24) {
            System.out.println("您屬於正常類型");
        } else if (bmi < 30) {
            System.out.println("您屬於微胖類型");
        }else {
            System.out.println("您超胖！");
        }
    }
}
