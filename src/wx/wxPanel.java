package wx;

import java.awt.Point;
import java.awt.Dimension;

import wx.JNI.*;

public class wxPanel extends java_wxpanel{

	static {
		System.loadLibrary("wxpanel");
	}

	public wxPanel(wxFrame parent, int id, Point location, Dimension size, int style, String name) {
		super(parent, id, (int) location.getX(), (int) location.getY(), (int) size.getWidth(), (int) size.getHeight(), style, name);
	}
	
	public wxPanel(wxFrame parent, int id) {
		super(parent, id, 0, 0, 400, 400, 0, "default name");
	}
}
