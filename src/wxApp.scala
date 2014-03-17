import wx.JNI.java_wxapp
import wx.JNI.wxapp_module

package wx {
	class wxApp extends java_wxapp {
		def onInit() : Boolean = true
		
		def callOnInit() {
			this.onInit()
		}
		
		def onRun() {
			this.java_OnRun()
		}
		
		def onExit() {
			this.java_OnExit()
		}
		
		private def start(args: Array[String]) {
			wxapp_module.java_wxEntryStart(args.length, args)
			this.callOnInit()
			this.onRun()
			this.onExit()
			wxapp_module.java_wxEntryCleanup()
		}
		
		def launch(args: Array[String], currentInstance : wxApp) {
			this.start(args);
		}
		
	}
} 
