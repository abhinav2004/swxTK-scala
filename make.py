#!/bin/python3

import sys

from scripts import make_wxapp as wxApp
from scripts import make_wxframe as wxFrame
from scripts import make_wxpanel as wxPanel
from scripts import make_wxbutton as wxButton
from scripts import make_wxmenubar as wxMenuBar
from scripts import make_wxdialog as wxDialog

def main(args):
	if(len(args) is not 1):
		for x in range(1, len(args)):
			if any("java" in s for s in args):
				wxApp.make_java()
				wxMenuBar.make_java()
				wxFrame.make_java()
				wxPanel.make_java()
				wxButton.make_java()
			elif args[x] == "wxApp":
				wxApp.make_natives()
				wxApp.make_java()
			elif args[x] == "wxFrame":
				wxFrame.make_natives()
				wxFrame.make_java()
			elif args[x] == "wxButton":
				wxButton.make_natives()
				wxButton.make_java()
			elif args[x] == "wxPanel":
				wxPanel.make_natives()
				wxPanel.make_java()
			elif args[x] == "wxMenuBar":
				wxMenuBar.make_natives()
				wxMenuBar.make_java()
			elif args[x] == "wxDialog":
				wxDialog.make_natives()
				wxDialog.make_java()
	else:
		wxApp.make_natives()
		wxButton.make_natives()
		wxPanel.make_natives()
		wxFrame.make_natives()
		wxMenuBar.make_natives()
		wxDialog.make_natives()
		wxApp.make_java()
		wxMenuBar.make_java()
		wxFrame.make_java()
		wxPanel.make_java()
		wxDialog.make_java()
		wxButton.make_java()
if __name__ == "__main__":
	main(sys.argv)