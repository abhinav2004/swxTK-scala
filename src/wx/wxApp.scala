import wx.java_wxapp
import wx.wxapp_module

package wx {
	abstract class wxApp extends java_wxapp {
		
		def onInit() : Boolean = true {
		}
		
		def callOnInit() {
			this.onInit()
		}
		
		def onRun() {
			this.java_OnRun()
		}
		
		def onExit() {
			this.java_OnExit()
		}
	
		private def start(aergs : Array[String]) {
			wxapp_module.java_wxEntryStart(args.length, args)
			this.callOnInit()
			this.onRun()
			this.onExit()
			wxapp_module.java_wxEntryCleanup()
		}
	
		def launch(args : Array[String], currentInstance : wxApp) {
			currentInstance.start(args);
		}
	}
} 
