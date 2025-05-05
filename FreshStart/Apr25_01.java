import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Apr25_01 {
    JLabel jlab;
    Apr25_01()
    {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("An Event Example");
        // Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());
        // Give the frame an initial size.
        jfrm.setSize(220, 90);
        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make two buttons.
        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");
        // Add action listener for Alpha.
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was pressed.");
                System.out.println("Alpha pressed");
            }
        });
        // Add action listener for Beta.
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Beta was pressed.");
                System.out.println("Beta Pressed");
            }
        });
        // Add the buttons to the content pane.
        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);
        // Create a text-based label.
        jlab = new JLabel("Press a button.");
        // Add the label to the content pane.
        jfrm.add(jlab);
        // Add action listener for Alpha.
        jbtnAlpha.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                jlab.setText("Alpha was pressed.");
            }
        });
        // Display the frame.
        jfrm.setVisible(true);
    }
    public static void main(String args[])
    {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Apr25_01();
            }
        }
        );

    }
}