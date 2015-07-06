package comboBox;

import java.awt.*;
import javax.swing.*;

public class ComboBoxTest
{
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable() {
		public void run()
		{
		    JFrame frame = new ComboBoxFrame();
		    frame.setTitle("TextComponentFrame");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		}
	    });
    }
}
