import javax.swing.*;
import javax.swing.*;
public class Apr21_01 {
    public static void main(String[] args) { // Create the main frame 
        JFrame frame = new JFrame("Z-Order Demo"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(300, 300); 
        // Create a panel with no layout manager (absolute positioning) 
        JPanel panel = new JPanel(null); 
        // Create two buttons 
        JButton button1 = new JButton("One"); 
        JButton button2 = new JButton("Two"); 
        // Set bounds for buttons (x, y, width, height) 
        button1.setBounds(90, 90, 100, 50); 
        // Appears first 
        button2.setBounds(10, 10, 100, 50); 
        // Overlaps button1, apears on top
        // Add buttons to the panel 
        panel.add(button1); 
        panel.add(button2); // Add panel to frame 
        frame.add(panel); // Make the frame visible 
        frame.setVisible(true); 
        System.out.println("Glass pane is "+ frame.getGlassPane());
        System.out.println("Layered Pane is "+frame.getLayeredPane()); 
        System.out.println("Z-order of button1: " + panel.getComponentZOrder(button1)); 
        System.out.println("Z-order of button2: " + panel.getComponentZOrder(button2));
    }
}