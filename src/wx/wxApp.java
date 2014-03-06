package wx;

import wx.JNI.*;

public class wxApp extends java_wxapp {

	static {
		System.loadLibrary("wxapp");
	}

	public boolean onInit() {
		return true;
	}
	
	public void callOnInit() {
		this.onInit();
	}
	
	public void onRun() {
		this.java_OnRun();
	}
	
	public void onExit() {
		this.java_OnExit();
	}

	private void start(String[] args) {
		wxapp_module.java_wxEntryStart(args.length, args);
		this.callOnInit();
		this.onRun();
		this.onExit();
		wxapp_module.java_wxEntryCleanup();
		
	}

	public static void launch(String[] args, wxApp currentInstance) {
		currentInstance.start(args);
	}
}