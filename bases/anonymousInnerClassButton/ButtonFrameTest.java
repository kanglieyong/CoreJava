package anonymousInnerClassButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrameTest
{
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable() {
		public void run()
		{
		    JFrame frame = new ButtonFrame();
		    frame.setTitle("ButtonFrame");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		}
	    });
    }
}
