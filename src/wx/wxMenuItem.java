package wx;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.AWTEvent;

import wx.JNI.*;

public class wxMenuItem extends java_wxmenuitem {
	static {
		System.loadLibrary("wxmenubar");
	}
	
	ActionListener listener;
	
	public wxMenuItem(wxMenu menu, int id, String name) {
		super(menu, id, name);
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