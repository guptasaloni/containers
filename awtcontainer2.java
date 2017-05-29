import java.awt.*;
import java.awt.event.*;
//import java.lang.*;
//import java.io.*;

public class awtcontainer2 extends Exception
{
	private Frame mainframe;       //creates reference
	private Label headerlabel;
	private Label statuslabel;		//statuslabel sows the current status of the frame
	//private Label headerlabel1;
	private Panel controlpanel;
	
	 public awtcontainer2()
	{
		preparegui();
	}
	private void preparegui()
	{
		mainframe=new Frame("FILE AND DIRECTORY SYSTEM");	//it creates or gives it to memory
		mainframe.setSize(500,400);
		mainframe.setLayout(new GridLayout(3,100));
		mainframe.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		//addWindowListener a class used to initialize component such as minimization,maximization and its memory is given by WindowAdapter which is a interface
		mainframe.addWindowListener(new WindowAdapter(){		
		
		public void WindowClosing(WindowEvent windowevent)	//this method is predefined used for exit the system
		{
			System.exit(1);
		}
		});
		
		headerlabel=new Label();
		headerlabel.setAlignment(Label.CENTER);
		headerlabel.setBackground(Color.red);
		statuslabel=new Label();
		//headerlabel1=new Label();
		statuslabel.setAlignment(Label.CENTER);
		statuslabel.setSize(200,100);
		controlpanel=new Panel();
		controlpanel.setLayout(new FlowLayout());
		mainframe.add(controlpanel);
		mainframe.add(headerlabel);
		mainframe.add(statuslabel);
		//controlpanel.setSize(400,500);
		//controlpanel.setBackground(Color.yellow);
		mainframe.setVisible(true);
		//controlpanel.setVisible(true);
	}
	private void showdialog()
	{
		headerlabel.setText("hii this is file system...");
		//headerlabel1.setText("hii this is controlpanel..");
		final FileDialog filed=new FileDialog(mainframe,"select file");		//show message
		Button sdb=new Button("open with");		//used to initialize  button or give a memory to sdb
		//Panel panel=new Panel();
		//panel.setBackground(Color.magenta);
		//mainframe.add(panel);
		//mainframe.setVisible(true);
		sdb.addActionListener(new ActionListener()
		{
		@ Override
		public void actionPerformed(ActionEvent e)				//actionPerformed is a predefined function of ActionListener interface
		{
			filed.setVisible(true);
			statuslabel.setText("selected file:"+filed.getDirectory()+filed.getFile());		//getDirectory() and getFile() methods used to get directory and file name
		}
		});
		controlpanel.add(sdb);
		mainframe.setVisible(true);
	}
	public static void main(String a[])
	{
		awtcontainer2 k=new awtcontainer2();
		k.showdialog();
	}
}