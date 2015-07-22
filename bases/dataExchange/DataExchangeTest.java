package dataExchange;

import java.awt.*;
import javax.swing.*;

public class DataExchangeTest
{
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable() {
		public void run()
		{
		    JFrame frame = new DataExchangeFrame();
		    frame.setTitle("DataExchangeFrame");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		}
	    });
    }
}
