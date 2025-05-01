import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class April19_01
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new RunnableTask());
    }
}
// Runnable class to create GUI
class RunnableTask implements Runnable
{
	@Override
	public void run()
	{
		new PLAF_UI().createGUI();
	}
}
class PLAF_UI //Pluggable Look and Feel
{
	public void createGUI()
    {
		JFrame frame = new JFrame("Pluggable Look and Feel Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.setLayout(new FlowLayout());
		JLabel label = new JLabel("Choose Look and Feel:");
		String[] lookAndFeels= {"Metal","Nimbus","Motif","Windows"};
		JComboBox<String> comboBox = new JComboBox<>(lookAndFeels);
		JButton button = new JButton("Sample Button");
		// Use a named ActionListener class
		comboBox.addActionListener(new LookAndFeelChangeListener(frame,comboBox));
		frame.add(label);
		frame.add(comboBox);
		frame.add(button);
		frame.setVisible(true);
	}
}
class LookAndFeelChangeListener implements ActionListener
{
	private JFrame frame;
	private JComboBox<String> comboBox;
	public LookAndFeelChangeListener(JFrame frame,
	JComboBox<String> comboBox)
	{
		this.frame = frame;
		this.comboBox = comboBox;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String selected = (String) comboBox.getSelectedItem();
		try
		{
			switch (selected)
			{
				case "Metal":
					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					break;
				case "Nimbus":
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					break;
				case "Motif":
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					break;
				case "Windows":
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					break;
			}
			SwingUtilities.updateComponentTreeUI(frame);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}