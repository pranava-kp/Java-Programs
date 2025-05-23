import javax.swing.*;
class Apr21_02
{ public Apr21_02()
    { // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Simple Swing Application");
        // Give the frame an initial size. 
        jfrm.setSize(275, 100); // Terminate the program when the user closes the application. 
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Create a text-based label. 
        JLabel jlab = new JLabel(" Swing means powerful GUIs."); //Add the label to the content pane. 
        jfrm.add(jlab); //Display the frame. 
        jfrm.setVisible(true);
    }
    public static void main(String args[])
    { 
        //Create the frame on the event dispatching thread. 
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run() 
            { 
                new Apr21_02(); 
            } 
            } 
        ); 
    } 
}