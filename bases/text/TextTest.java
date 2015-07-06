package text;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextTest
{
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable() {
		public void run()
		{
		    JFrame frame = new TextComponentFrame();
		    frame.setTitle("TextComponentFrame");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		}
	    });
    }
}
