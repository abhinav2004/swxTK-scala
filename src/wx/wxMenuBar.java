package wx;

import wx.JNI.*;



public class wxMenuBar extends java_wxmenubar {
	static {
		System.loadLibrary("wxmenubar");
	}
	
	public wxMenuBar() {
		super(0);
	}
	
	public void append(wxMenu menu, String name) {
		this.java_Append(menu, name);
	}
}