package Chapter1;

// setColor 設定顏色
// fillRect 填滿的正方形
// drawLine 畫線
// drawOval 畫圓
// ImageIcon 繪製圖形

import javax.swing.*;
import java.awt.*;

public class JavaGUI extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        int height = getHeight();
        int width = getWidth();

        g.setColor(Color.BLUE);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.RED);
        g.drawLine(10, 10, 50, 10);
        g.drawLine(50, 10, 50, 50);
        g.drawOval(0, 0, 100, 100);
        g.drawString("Hello Word.", 100, 100);
        ImageIcon img = new ImageIcon("panda.jpg");
        img.paintIcon(null, g, 50, 50);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new JavaGUI());
        window.setVisible(true);
    }
}
