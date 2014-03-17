import wx._ 
import wx.JNI._

import java.awt._

object myApp extends myApp {
	def main(args: Array[String]) {
		launch(args, this)
	}
}

class myApp extends wxApp {
	override def onInit() : Boolean = {
		val frame = new wxFrame(null, -1, "This is a Frame", new Point(0,0), new Dimension(800,600), wxFrame.wxDEFAULT_FRAME_STYLE, "mainFrame")
		frame.show(true)
		frame.center(wxFrame.wxOrientation.wxHORIZONTAL)
		return true
	}
}
