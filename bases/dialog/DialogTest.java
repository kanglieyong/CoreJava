package dialog;

import java.awt.*;
import javax.swing.*;

public class DialogTest
{
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable() {
		public void run()
		{
		    JFrame frame = new DialogFrame();
		    frame.setTitle("TextComponentFrame");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		}
	    });
    }
}
