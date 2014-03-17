package wx;

import wx.JNI.*;

public class wxMenu extends java_wxmenu {
	static {
		System.loadLibrary("wxmenubar");
	}
	
	public wxMenu() {
		super(0);
	}
	
	public wxMenu(String name) {
		super(name,0);
	}
	
	public void append(int id, String name) {
		this.java_Append(id, name);
	}
	
	public void append(wxMenuItem menuitem) {
		this.java_Append(menuitem);
	}
}