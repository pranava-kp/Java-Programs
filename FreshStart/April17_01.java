import java.awt.*;
import java.awt.event.*; //AWT base GUI program
public class April17_01 {
    public static void main(String[] args) {
        // Create a new frame
        Frame frame = new Frame("AWT Button Example");
        // Create a new button
        Button button = new Button("Click Me");
        // Set button position on the frame
        button.setBounds(100, 100, 80, 30); // x, y, width, height
        // Add button to the frame
        frame.add(button);// Set frame size and layout
        frame.setSize(300, 200);
        frame.setLayout(null); // Using no layout managers
        // Make frame visible
        frame.setVisible(true);
        // Add a window closing event to close the application
        frame.addWindowListener(new WindowAdapter()
        { //ANONYMOUS CLASS
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Frame Disposed");
                frame.dispose();
            }
            });
    }
}