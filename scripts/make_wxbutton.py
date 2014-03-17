import os
import sys
import subprocess

JAVA_HOME = os.environ['JAVA_HOME']
CXX = "g++"
WXWIDGETS_CXXOP = "`wx-config --cppflags` `wx-config --libs` "
CXXOP = " -pipe -c -shared -fPIC " + WXWIDGETS_CXXOP + "-L./build/natives -I"+JAVA_HOME+"/include/ -I"+JAVA_HOME+"/include/linux/ "
SWIG = "swig -c++ -java "
JAVAC = "javac -d ./build/ "

def make_all():
	print ("\n\033[1;37mMaking wxButton.\033[0m")
	make_swig()
	make_cpp()
	make_java()


def make_natives():
	print ("\n\033[1;37mMaking wxButton.\033[0m")
	make_swig()
	make_cpp()

def make_swig():
	print ("\n\t\033[1;37m--> Generating SWIG interfaces for wxButton.\033[0m")
	print ("\t" + SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxbutton_module.i")
	swigproc = os.system(SWIG + "-package wx.JNI -outdir src/wx/JNI src/wxbutton_module.i")
	if swigproc is not 0:
		print ("Error! Aborting!")
		sys.exit(1)
def make_cpp():
	print ("\n\t\033[1;37m--> Compiling wxButton C++ library.\033[0m")
	print ("\t" + CXX + CXXOP + "src/java_wxbutton.cpp -o obj/java_wxbutton.o");
	cxxproc = os.system(CXX + CXXOP + "src/java_wxbutton.cpp -o obj/java_wxbutton.o");
	if cxxproc is not 0:
		print ("Error! Aborting!")
		sys.exit(1)
	
	print ("\n\t" + CXX + CXXOP + "src/wxbutton_module_wrap.cxx -o obj/wxbutton_module_wrap.o");
	cxxproc = os.system(CXX + CXXOP + "src/wxbutton_module_wrap.cxx -o obj/wxbutton_module_wrap.o");
	if cxxproc is not 0:
		print ("Error! Aborting!")
		sys.exit(1)
	
	# Do NOT change the sequence of the arguments passed to g++. It may seem to work on your distro but may not work on others. 
	# The following code works on most of the distros like Ubuntu and Arch Linux.
	print ("\n\t" + CXX + " -shared -fPIC obj/wxbutton_module_wrap.o obj/java_wxbutton.o " + WXWIDGETS_CXXOP + "-o ./build/natives/libwxbutton.so");
	cxxproc = os.system(CXX + " -shared -fPIC obj/wxbutton_module_wrap.o obj/java_wxbutton.o " + WXWIDGETS_CXXOP + "-o ./build/natives/libwxbutton.so");
	if cxxproc is not 0:
		print ("Error! Aborting!")
		sys.exit(1)
def make_java():
	print ("\n\t\033[1;37m--> Compiling wxButton Java class.\033[0m")
	print ("\t" + JAVAC + " -cp ./src src/wx/wxButton.java")
	javaproc = os.system("\t"+JAVAC + " -cp ./src src/wx/wxButton.java")
	if javaproc is not 0:
		print ("Error! Aborting!")
		sys.exit(1)