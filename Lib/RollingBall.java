package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RollingBall extends JPanel implements ActionListener{
    int x = 100 ;
    int y = 90 ;
    int start_angle = 0 ;
    public RollingBall(){
        Timer timer1 = new Timer(100, this);
        timer1.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 80, 80);
        g.fillArc(x, y, 80, 80, start_angle, 180);
    }
    public void actionPerformed(ActionEvent e) {
        x -= 10 ;
        start_angle += 10 ;
        if (x==-80) x = getWidth();
        if (start_angle == 360) start_angle = 0 ;
        repaint();
    }
}
