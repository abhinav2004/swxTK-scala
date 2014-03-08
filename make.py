import sys

from scripts import make_wxapp as wxApp
from scripts import make_wxframe as wxFrame
from scripts import make_wxpanel as wxPanel
from scripts import make_wxbutton as wxButton
from scripts import make_wxmenubar as wxMenuBar

def main(args):
	if any("java" in s for s in args):
		wxApp.make_java()
		wxMenuBar.make_java()
		wxFrame.make_java()
		wxPanel.make_java()
		wxButton.make_java()
	else:
		wxApp.make_natives()
		wxButton.make_natives()
		wxPanel.make_natives()
		wxFrame.make_natives()
		wxMenuBar.make_natives()
	
		wxApp.make_java()
		wxMenuBar.make_java()
		wxFrame.make_java()
		wxPanel.make_java()
		wxButton.make_java()
if __name__ == "__main__":
	main(sys.argv)