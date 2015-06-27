package anonymousInnerClassButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame extends JFrame
{
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame()
    {
	setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	
	buttonPanel = new JPanel();
	add(buttonPanel);

	makeButton("Yellow", Color.YELLOW);
	makeButton("Blue", Color.BLUE);
	makeButton("Red", Color.RED);
    }

    public void makeButton(String name, final Color backgroundColor)
    {
        JButton colorButton = new JButton(name);
	buttonPanel.add(colorButton);
	colorButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event)
		{
		    buttonPanel.setBackground(backgroundColor);
		}
	    });
    }
}
