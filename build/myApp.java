import wx.*;

import java.awt.*;
import java.awt.event.*;

class myApp extends wxApp implements ActionListener
{
	private wxFrame frame;
	private wxFrame internalframe;
	
	private wxButton button1;
	private wxButton button2;
	private wxMenuBar menubar;
	private wxMenu menu;
	private wxMenuItem menuitem1;
	private wxMenuItem menuitem2;
	private wxMenuItem menuitem3;
	
	String args[];

	@Override
	public boolean onInit() {
		frame = new wxFrame(null, -1, "This is a Frame", new Point(0,0), new Dimension(800,600), wxFrame.wxDEFAULT_FRAME_STYLE, "mainFrame");
		
		
		wxPanel panel = new wxPanel(frame, -1);
		
		button1 = new wxButton(panel, 0, "Button 1", new Point(10,10), new Dimension(100,32), 1, "button");
		button1.addActionListener(this);
		
		System.out.println(button1.toString());
		
		button2 = new wxButton(panel, 1, "Button 2", new Point(120,10), new Dimension(100,32), 1, "button 2");
		button2.addActionListener(this);
		
		System.out.println(button2.toString());
		
		menubar = new wxMenuBar();
		menu = new wxMenu();
		menuitem1 = new wxMenuItem(menu, -1, "&New\tCtrl+N");
		menuitem1.addActionListener(this);
		menuitem2 = new wxMenuItem(menu, -1, "&Open\tCtrl+O");
		menuitem2.addActionListener(this);
		menuitem3 = new wxMenuItem(menu, -1, "&Exit\tCtrl+Q");
		menuitem3.addActionListener(this);
		menu.append(menuitem1);
		menu.append(menuitem2);
		menu.append(menuitem3);
		menubar.append(menu, "&File");
		
		frame.setMenuBar(menubar);
		
		frame.show(true);
		frame.center(wxFrame.wxOrientation.wxHORIZONTAL);
		
		return true;
	}

	public static void main(String args[]) {
		final myApp currentInstance = new myApp();
		currentInstance.args = args;
		launch(args, currentInstance);
				
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getSource().toString());
		if(event.getSource() == button1) {
			System.out.println("Button 1 pressed.");
		}
		else if(event.getSource() == button2) {
			System.out.println("Button 2 pressed.");
		}
		else if(event.getSource() == menuitem1) {
			internalframe = new wxFrame(frame, -1, "This is a Internal Frame");
			internalframe.show(true);
		}
		else if(event.getSource() == menuitem2) {
			System.out.println("Opening file!");
		}
		else if(event.getSource() == menuitem3) {
			System.exit(0);
		}
	}
}