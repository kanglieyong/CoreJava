package dataExchange;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DataExchangeFrame extends JFrame
{
    public static final int DEFAULT_WIDTH = 20;
    public static final int DEFAULT_HEIGHT = 40;
    private PasswordChooser dialog = null;
    private JTextArea textArea;

    public DataExchangeFrame()
    {
	JMenuBar mbar = new JMenuBar();
	setJMenuBar(mbar);
	JMenu fileMenu = new JMenu("file");
	mbar.add(fileMenu);

	JMenuItem connectItem = new JMenuItem("Connect");
	connectItem.addActionListener(new ConnectAction());
	fileMenu.add(connectItem);

	JMenuItem exitItem = new JMenuItem("Exit");
	exitItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event)
		{
		    System.exit(0);
		}
	    });
	fileMenu.add(exitItem);
    }

    private class ConnectAction implements ActionListener
    {
	public void actionPerformed(ActionEvent event)
	{
	    if (dialog == null) dialog = new PasswordChooser();

	    dialog.setUser(new User("yourname", null));
	    if (dialog.showDialog(DataExchangeFrame.this, "Connect")) {
		User u = dialog.getUser();
		textArea.append("user name = " + u.getName() + ", password = " + (new String(u.getPassword())) + "\n");
	    }
	}
    }
}
