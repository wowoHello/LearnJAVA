package Chapter1;

import javax.swing.*;
import java.awt.*;

public class LoopLab extends JPanel {
    String type;
    int n;

    public LoopLab() {
        type = JOptionPane.showInputDialog("您希望使用的是加法表還是乘法表？(請輸入A或M)");
        // JOptionPane.showInputDialog為String，要先轉換為int
        n = Integer.parseInt(JOptionPane.showInputDialog("您希望的表格大小為？(? * ?)"));
    }

    @Override
    public void paintComponent(Graphics g) {
        var h = getHeight();
        var w = getWidth();
        var x = 0;
        var y = 0;
        var cellW = w / n;
        var cellH = h / n;

        for (var i = 1; i <= n; i++) {
            for(var j = 1; j <= n; j++) {
                if (i == 1 || j == 1) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(x, y, cellW, cellH);
                }
                g.setColor(Color.BLACK);
                g.drawRect(x, y, cellW, cellH);

                if (i == 1) {
                    g.drawString("" + j, x + 5, y + 20);
                } else if (j == 1) {
                    g.drawString("" + i, x + 5, y + 20);
                } else {
                    int value;
                    if (type.toUpperCase().equals("A")) {
                        value = i + j;
                    } else {
                        value = i * j;
                    }
                    g.drawString("" + value, x + 5, y + 20);
                }
                x += cellW;
            }
            x = 0;
            y += cellH;
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new LoopLab());
        window.setVisible(true);
    }
}