#include <wx/wx.h>
#include "../include/java_wxdialog.h"

java_wxdialog::java_wxdialog(java_wxdialog* parent, int id, std::string title, int x, int y, int width, int height, long style,std::string name) : wxDialog (parent, id, wxString::FromUTF8(title.c_str()), wxPoint(x,y),wxDefaultPosition, wxSize(width, height), wxDEFAULT_DIALOG_STYLE, name)
{
	
}

void java_wxdialog::java_Show()
{
	wxFrame::Show();
}

void java_wxdialog::java_ShowModal()
{
	wxFrame::Show();
}

void java_wxdialog::java_Center()
{
	wxFrame::Center();
}

void java_wxdialog::java_Center(int direction)
{
	wxFrame::Center(direction);
}