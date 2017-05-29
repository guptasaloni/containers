import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.io.*;

public class awtcontainer1 extends Exception
{
	private Frame mainframe;//creates reference
	private Label headerlabel;
	private Label headerlabel1;
	private Panel controlpanel;
	
	 public awtcontainer1()
	{
		preparegui();
	}
	private void preparegui()
	{
		mainframe=new Frame("LIBRARY MANAGEMENT");	//it creates or gives it to memory
		mainframe.setSize(500,400);
		mainframe.setLayout(new GridLayout());
		//addWindowListener a class used to initialize component such as minimization,maximization and its memory is given by WindowAdapter
		mainframe.addWindowListener(new WindowAdapter(){;		
		
		public void WindowClosing(WindowEvent windowevent)
		{
			System.exit(0);
		}
		});
		
		headerlabel=new Label();
		headerlabel1=new Label();
		headerlabel.setAlignment(Label.CENTER);
		headerlabel.setBackground(Color.red);
		controlpanel=new Panel();
		controlpanel.setLayout(new FlowLayout());
		mainframe.add(controlpanel);
		controlpanel.add(headerlabel);
		mainframe.add(headerlabel1);
		controlpanel.setSize(400,500);
		controlpanel.setBackground(Color.yellow);
		mainframe.setVisible(true);
		//controlpanel.setVisible(true);
	}
	private void showpanel()
	{
		headerlabel.setText("hii this is headerlabel...");
		headerlabel1.setText("hii this is controlpanel..");
		Panel panel=new Panel();
		panel.setBackground(Color.magenta);
		mainframe.add(panel);
		mainframe.setVisible(true);
	}
	public static void main(String a[])
	{
		awtcontainer1 k=new awtcontainer1();
		k.showpanel();
	}
}