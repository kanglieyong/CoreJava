package plaf;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlafFrameTest
{
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable() {
		public void run()
		{
		    JFrame frame = new PlafFrame();
		    frame.setTitle("Plaf Frame");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		}
	    });
    }
}
