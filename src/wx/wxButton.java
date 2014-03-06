package wx;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.AWTEvent;

import wx.JNI.*;

public class wxButton extends java_wxbutton {
	static {
		System.loadLibrary("wxbutton");
	}

	private ActionListener listener;

	public wxButton(wxPanel parent, int id, String title, Point location, Dimension size, int style, String name) {
		super(parent, id, title, (int) location.getX(), (int) location.getY(), (int) size.getWidth(), (int) size.getHeight(), style, name);
	}

	public wxButton(wxPanel parent, int id, String title) {
		super(parent, id, title, 10,10, 100, 32, 0, "default name");
	}
	
	public void addActionListener(ActionListener listener)
	{
		this.listener = listener;
	}
	
	@Override
	public void OnClick()
	{
		listener.actionPerformed(new ActionEvent(this, (int) AWTEvent.ACTION_EVENT_MASK, "OnClick"));
	}
}