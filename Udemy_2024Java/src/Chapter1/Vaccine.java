package Chapter1;

// JOptionPane.showInputDialog() 彈跳出的輸入框
// JOptionPane.showMessageDialog() 彈跳出的顯示框

import javax.swing.*;

public class Vaccine {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(選項包含AZ、BNT、Moderna、Janssen)： ");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")) {
            JOptionPane.showMessageDialog(null, "AZ\n開發國：英國、瑞典\n疫苗類型：腸病毒疫苗\n劑量：2\n保護率：81%\n副作用：接種部位疼痛紅腫、疲倦、頭痛、肌肉痠痛、畏寒、關節痛、發燒(各家發生比例不同)\n採購量：1000萬劑(原廠)\n到貨狀態：184.96萬(原廠+COVAX+日本)");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null, "BNT\n開發國：英國、瑞典\n疫苗類型：腸病毒疫苗\n劑量：2\n保護率：81%\n副作用：接種部位疼痛紅腫、疲倦、頭痛、肌肉痠痛、畏寒、關節痛、發燒(各家發生比例不同)\n採購量：1000萬劑(原廠)\n到貨狀態：184.96萬(原廠+COVAX+日本)");
        } else if (vaccine.equals("moderna")) {
            JOptionPane.showMessageDialog(null, "Morderna\n開發國：英國、瑞典\n疫苗類型：腸病毒疫苗\n劑量：2\n保護率：81%\n副作用：接種部位疼痛紅腫、疲倦、頭痛、肌肉痠痛、畏寒、關節痛、發燒(各家發生比例不同)\n採購量：1000萬劑(原廠)\n到貨狀態：184.96萬(原廠+COVAX+日本)");
        } else if (vaccine.equals("janssen")) {
            JOptionPane.showMessageDialog(null, "Janssen\n開發國：英國、瑞典\n疫苗類型：腸病毒疫苗\n劑量：2\n保護率：81%\n副作用：接種部位疼痛紅腫、疲倦、頭痛、肌肉痠痛、畏寒、關節痛、發燒(各家發生比例不同)\n採購量：1000萬劑(原廠)\n到貨狀態：184.96萬(原廠+COVAX+日本)");
        } else {
            JOptionPane.showMessageDialog(null, "無法辨別輸入內容，請重新確認輸入的內容沒有中文字或是空白鍵，且符合規定項目");
        }
    }
}
