package calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorTest
{
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable() {
		public void run()
		{
		    JFrame frame = new CalculatorFrame();
		    frame.setTitle("Calculator Frame");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		}
	    });
    }
}
