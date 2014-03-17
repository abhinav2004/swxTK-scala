import wx.JNI.java_wxframe
import wx.JNI.wxframe_module

package wx {
	object wxFrame {
		val wxMINIMIZE_BOX 			= Integer.decode ("0x0400");
		val wxMAXIMIZE_BOX 			= Integer.decode ("0x0200");
		val wxRESIZE_BORDER 		= Integer.decode ("0x0040");
		val wxSYSTEM_MENU 			= Integer.decode ("0x0800");
		val wxCAPTION 				= Integer.decode ("0x20000000");
		val wxCLOSE_BOX 			= Integer.decode ("0x1000");
		val wxCLIP_CHILDREN 		= Integer.decode ("0x00400000");
		val wxICONIZE 				= Integer.decode ("0x4000");
		val wxMINIMIZE 				= wxICONIZE;
		val wxMAXIMIZE	 			= Integer.decode ("0x2000");
		val wxSTAY_ON_TOP 			= Integer.decode ("0x8000");	
		val wxFRAME_EX_CONTEXTHELP 	= Integer.decode ("0x00000080");
		val wxFRAME_EX_METAL 		= Integer.decode ("0x00000040");
	
		val wxDEFAULT_FRAME_STYLE 	= wxMINIMIZE_BOX | wxMAXIMIZE_BOX | wxRESIZE_BORDER | wxSYSTEM_MENU | wxCAPTION | wxCLOSE_BOX | wxCLIP_CHILDREN;
	
		/*
		* wxNonOwnedWindow specific styles:
		*/
		
		val wxFRAME_SHAPED	 	= Integer.decode ("0x0010");
		
		/*
		* wxFrame specific styles:
		*/
		
		val wxFRAME_NO_TASKBAR		= Integer.decode ("0x0002");
		val wxFRAME_TOOL_WINDOW		= Integer.decode ("0x0004");
		val wxFRAME_FLOAT_ON_PARENT	= Integer.decode ("0x0008");
		
		object wxOrientation extends Enumaration {
			type wxOrientation = Value
			val wxHORIZONTAL, wxVERTICAL, wxBOTH, wxORIENTATION_MASK
		}
	}
	
	class wxFrame {
		//TODO: Implement wxFrame multiple constructors.
	}
}
