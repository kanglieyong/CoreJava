package dialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AboutDialog extends Dialog
{
    public AboutDialog(JFrame owner)
    {
	super(owner, "About DialogTest", true);
	add(new JLabel("<html><h1><i>Dialog</i></h1><hr>By XXX</html>"), BorderLayout.CENTER);

	JButton ok = new JButton("Ok");
	ok.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event)
		{
		    setVisible(false);
		}
	    });
	JPanel panel = new JPanel();
	panel.add(ok);
	add(panel, BorderLayout.SOUTH);
	pack();
    }
}
