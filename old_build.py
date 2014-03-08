#!/bin/python3

import os
import sys

# Compilers and their arguments:

GPP = "g++ -shared -fPIC `wx-config --cppflags` `wx-config --libs` -L./build/natives -I/opt/java/include/ -I/opt/java/include/linux/ "
JAVAC = "javac -d ./build/ "
SWIG = "swig -c++ -java "

def build_wxApp():
	# Building wxApp for java
	print ("\033[1;37mBuilding wxApp.\033[0m")
	print ("")
	print ("\033[1;37m--> Generating interface files\033[0m")
	print ("\t"+SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxapp_module.i")
	os.system(SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxapp_module.i")
	print ("")
	print ("\033[1;37m--> Compiling C++ source code.\033[0m")
	print ("\t"+GPP + "src/wxapp_module_wrap.cxx src/java_wxapp.cpp -o ./build/natives/libwxapp.so")
	os.system(GPP + "src/wxapp_module_wrap.cxx src/java_wxapp.cpp -o ./build/natives/libwxapp.so")
	print ("")
	print ("\033[1;37m--> Generating wxApp java class.\033[0m")
	print (JAVAC + " -cp ./src src/wx/wxApp.java")
	os.system("\t"+JAVAC + " -cp ./src src/wx/wxApp.java")
	print ("")
	
def build_wxFrame():
	# Building wxFramefor java
	print ("\033[1;37mBuilding wxFrame.\033[0m")
	print ("")
	print ("\033[1;37m--> Generating interface files\033[0m")
	print ("\t"+SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxframe_module.i")
	os.system(SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxframe_module.i")
	print ("")
	print ("\033[1;37m--> Compiling C++ source code.\033[0m")
	print ("\t"+GPP + "src/wxframe_module_wrap.cxx src/java_wxframe.cpp -o ./build/natives/libwxframe.so")
	os.system(GPP + "src/wxframe_module_wrap.cxx src/java_wxframe.cpp -o ./build/natives/libwxframe.so")
	print ("")
	print ("\033[1;37m--> Generating wxFrame java class.\033[0m")
	print (JAVAC + " -cp ./src/wxFrame src/wx/wxFrame.java")
	os.system("\t"+JAVAC + " -cp ./src src/wx/wxFrame.java")
	print ("")

def build_wxPanel():
	# Building wxApp for java
	print ("\033[1;37mBuilding wxPanel.\033[0m")
	print ("")
	print ("\033[1;37m--> Generating interface files\033[0m")
	print ("\t"+SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxpanel_module.i")
	os.system(SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxpanel_module.i")
	print ("")
	print ("\033[1;37m--> Compiling C++ source code.\033[0m")
	print ("\t"+GPP + "src/wxpanel_module_wrap.cxx src/java_wxpanel.cpp -o ./build/natives/libwxpanel.so")
	os.system(GPP + "src/wxpanel_module_wrap.cxx src/java_wxpanel.cpp -o ./build/natives/libwxpanel.so")
	print ("")
	print ("\033[1;37m--> Generating wxPanel java class.\033[0m")
	print (JAVAC + " -cp ./src src/wx/wxPanel.java")
	os.system("\t"+JAVAC + " -cp ./src src/wx/wxPanel.java")
	print ("")

def build_wxButton():
	# Building wxApp for java
	print ("\033[1;37mBuilding wxButton.\033[0m")
	print ("")
	print ("\033[1;37m--> Generating interface files\033[0m")
	print ("\t"+SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxbutton_module.i")
	os.system(SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxbutton_module.i")
	print ("")
	print ("\033[1;37m--> Compiling C++ source code.\033[0m")
	print ("\t"+GPP + "src/wxbutton_module_wrap.cxx src/java_wxbutton.cpp -o ./build/natives/libwxbutton.so")
	os.system(GPP + "src/wxbutton_module_wrap.cxx src/java_wxbutton.cpp -o ./build/natives/libwxbutton.so")
	print ("")
	print ("\033[1;37m--> Generating wxButton java class.\033[0m")
	print (JAVAC + " -cp ./src src/wx/wxButton.java")
	os.system("\t"+JAVAC + " -cp ./src src/wx/wxButton.java")
	print ("")
	
def build_wxMenuBar():
	# Building wxMenuBar for java
	print ("\033[1;37mBuilding wxMenuBar, wxMenu and wxMenuItem.\033[0m")
	print ("")
	print ("\033[1;37m--> Generating interface files\033[0m")
	print ("\t"+SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxmenubar_module.i")
	os.system(SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxmenubar_module.i")
	print ("")
	print ("\033[1;37m--> Compiling C++ source code.\033[0m")
	print ("\t"+GPP + "src/wxmenubar_module_wrap.cxx src/java_wxmenubar.cpp -o ./build/natives/libwxmenubar.so")
	os.system(GPP + "src/wxmenubar_module_wrap.cxx src/java_wxmenubar.cpp -o ./build/natives/libwxmenubar.so")
	print ("")
	print ("\033[1;37m--> Generating wxMenuBar, wxMenu and wxMenuItem java classes.\033[0m")
	print (JAVAC + " -cp ./src src/wx/wxMenuBar.java")
	os.system("\t"+JAVAC + " -cp ./src src/wx/wxMenuBar.java")
	print (JAVAC + " -cp ./src src/wx/wxMenu.java")
	os.system("\t"+JAVAC + " -cp ./src src/wx/wxMenu.java")
	print (JAVAC + " -cp ./src src/wx/wxMenuItem.java")
	os.system("\t"+JAVAC + " -cp ./src src/wx/wxMenuItem.java")
	print ("")
	
def build_wxDialog():
	print ("\033[1;31mWARNING!!!!! wxDialog code is not complete. WIP!!\033[0m");
	# Building wxDialogfor java
	print ("\033[1;37mBuilding wxDialog.\033[0m")
	print ("")
	print ("\033[1;37m--> Generating interface files\033[0m")
	print ("\t"+SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxdialog_module.i")
	os.system(SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxdialog_module.i")
	print ("")
	print ("\033[1;37m--> Compiling C++ source code.\033[0m")
	print ("\t"+GPP + "src/wxdialog_module_wrap.cxx src/java_wxdialog.cpp -o ./build/natives/libwxdialog.so")
	os.system(GPP + "src/wxdialog_module_wrap.cxx src/java_wxdialog.cpp -o ./build/natives/libwxdialog.so")
	print ("")
	print ("\033[1;37m--> Generating wxDialog java class.\033[0m")
	print (JAVAC + " -cp ./src/wxDialog src/wx/wxDialog.java")
	os.system("\t"+JAVAC + " -cp ./src src/wx/wxDialog.java")
	print ("")

def main(args):
	if len(args) == 0:
		build_wxApp()
		build_wxButton()
		build_wxPanel()
		build_wxDialog()
		build_wxFrame()
		build_wxMenuBar()
	elif any("wxApp" in s for s in args):
		build_wxApp()
	elif any("wxFrame" in s for s in args):
		build_wxFrame()
	elif any("wxButton" in s for s in args):
		build_wxButton()
	elif any("wxPanel" in s for s in args):
		build_wxPanel()
	elif any("wxMenuBar" in s for s in args):
		build_wxMenuBar()
	elif any("wxDialog" in s for s in args):
		build_wxDialog()
	else:
		build_wxApp()
		build_wxButton()
		build_wxPanel()
		build_wxDialog()
		build_wxFrame()
		build_wxMenuBar()

if __name__ == "__main__":
	main(sys.argv)
	