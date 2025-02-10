//import javax.swing.*;
import javax.swing.*;
import java.awt.*;
public class Experimentation extends JPanel{
    public void init(){
        setBackground(Color.YELLOW);
        setSize(300,300);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Hello World", 150, 170);
        g.setColor(Color.blue);
        g.fillOval(0, 0, 60, 60);
    }
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Experimentation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(new Experimentation());
        frame.setVisible(true);
    }
}
