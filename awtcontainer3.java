import java.awt.* ;
import java.awt.event.* ;

public class awtcontainer3
{
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	public awtcontainer3()
	{
		prepareGUI();
	}
	public static void main(String[] args)
	{
		awtcontainer3 awtControlDemo = new awtcontainer3();
		awtControlDemo.showbutton();
	}

	private void prepareGUI()
	{
		mainFrame = new Frame("Java AWT Examples");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter(){
	
	public void windowClosing(WindowEvent windowEvent)
	{
		System .exit(0);
	}
	});
	headerLabel = new Label();
	headerLabel.setAlignment(Label.CENTER);
	statusLabel = new Label();
	statusLabel.setAlignment(Label.CENTER);
	statusLabel.setSize(350,100);
	controlPanel = new Panel();
	controlPanel.setLayout(new FlowLayout());
	mainFrame.add(headerLabel);
	mainFrame.add(controlPanel);
	mainFrame.add(statusLabel);
	mainFrame.setVisible(true);
	}
	private void showbutton()
	{
	headerLabel.setText("Control in action: buttons");
	//final FileDialog fileDialog = new FileDialog(mainFrame,"Select file");
	Button okButton = new Button("press ok");
	okButton.setBackground(Color.magenta);
	Button submitButton=new Button("press submit");
	submitButton.setBackground(Color.red);
	Button cancelButton=new Button("press cancel");
	cancelButton.setBackground(Color.yellow);
	okButton.addActionListener(new ActionListener() 
	{
	@ Override
	public void actionPerformed(ActionEvent e) 
	{
		//fileDialog.setVisible(true);
		statusLabel.setText("ok button clicked");
	}
	});
	submitButton.addActionListener(new ActionListener() 
	{
	@ Override
	public void actionPerformed(ActionEvent e) 
	{
		//fileDialog.setVisible(true);
		statusLabel.setText("submit button clicked");
	}
	});
	cancelButton.addActionListener(new ActionListener() 
	{
	@ Override
	public void actionPerformed(ActionEvent e) 
	{
		//fileDialog.setVisible(true);
		statusLabel.setText("cancel button clicked");
	}
	});
	controlPanel.add(okButton);
	controlPanel.add(submitButton);
	controlPanel.add(cancelButton);
	mainFrame.setVisible(true);
	}
}