package wx;

import java.awt.Point;
import java.awt.Dimension;

import wx.JNI.*;

public class wxFrame extends java_wxframe{

	static {
		System.loadLibrary("wxframe");
	}

	/*
	 * Definations
	 * Default wxWindow styles:
	*/

	public final static int wxMINIMIZE_BOX 		= Integer.decode ("0x0400");
	public final static int wxMAXIMIZE_BOX 		= Integer.decode ("0x0200");
	public final static int wxRESIZE_BORDER 	= Integer.decode ("0x0040");
	public final static int wxSYSTEM_MENU 		= Integer.decode ("0x0800");
	public final static int wxCAPTION 		= Integer.decode ("0x20000000");
	public final static int wxCLOSE_BOX 		= Integer.decode ("0x1000");
	public final static int wxCLIP_CHILDREN 	= Integer.decode ("0x00400000");
	public final static int wxICONIZE 		= Integer.decode ("0x4000");
	public final static int wxMINIMIZE 		= wxICONIZE;
	public final static int wxMAXIMIZE 		= Integer.decode ("0x2000");
	public final static int wxSTAY_ON_TOP 		= Integer.decode ("0x8000");
	public final static int wxFRAME_EX_CONTEXTHELP 	= Integer.decode ("0x00000080");
	public final static int wxFRAME_EX_METAL 	= Integer.decode ("0x00000040");
	
	public final static int wxDEFAULT_FRAME_STYLE 	= wxMINIMIZE_BOX | wxMAXIMIZE_BOX | wxRESIZE_BORDER | wxSYSTEM_MENU | wxCAPTION | wxCLOSE_BOX | wxCLIP_CHILDREN;
	
	/*
	 * wxNonOwnedWindow specific styles:
	*/
	
	public final static int wxFRAME_SHAPED	 	= Integer.decode ("0x0010");
	
	/*
	 * wxFrame specific styles:
	*/
	
	public final static int wxFRAME_NO_TASKBAR	= Integer.decode ("0x0002");
	public final static int wxFRAME_TOOL_WINDOW	= Integer.decode ("0x0004");
	public final static int wxFRAME_FLOAT_ON_PARENT	= Integer.decode ("0x0008");
	
	/*
	 * Enums:
	*/
	
	public static enum wxOrientation {
		wxHORIZONTAL,wxVERTICAL, wxBOTH, wxORIENTATION_MASK 
	}
	
	public wxFrame(wxFrame parent, int id, String title, Point location, Dimension size, int style, String name) {
		super(parent, id, title, (int) location.getX(), (int) location.getY(), (int) size.getWidth(), (int) size.getHeight(), style, name);
	}
	
	public wxFrame(wxFrame parent, int id, String title) {
		super(parent, id, title, 0, 0, 400, 400, wxDEFAULT_FRAME_STYLE, "default name");
	}
	
	public void center() {
		this.java_Center();
	}
	
	public void center(wxOrientation direction) {
		this.java_Center(direction.ordinal());
	}
	
	public void show(boolean val) {
		this.java_Show(val);
	}
	
	public void setMenuBar(wxMenuBar menubar) {
		this.java_SetMenuBar(menubar);
	}
}
