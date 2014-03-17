#include <wx/wx.h>
#include "../include/java_wxframe.h"

java_wxframe::java_wxframe(java_wxframe* parent, int id, std::string title, int x, int y, int width, int height, long style,std::string name) : wxFrame (parent, id, wxString::FromUTF8(title.c_str()), wxPoint(x,y), wxSize(width, height), wxDEFAULT_FRAME_STYLE, name)
{
	
}

void java_wxframe::java_Show(bool val)
{
	wxFrame::Show(val);
}

void java_wxframe::java_Center()
{
	wxFrame::Center();
}

void java_wxframe::java_Center(int direction)
{
	wxFrame::Center(direction);
}

void java_wxframe::java_SetMenuBar(java_wxmenubar *menubar)
{
	wxFrame::SetMenuBar(menubar);
}

