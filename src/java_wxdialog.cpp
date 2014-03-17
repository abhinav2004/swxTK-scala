#include <wx/wx.h>
#include "../include/java_wxdialog.h"

java_wxdialog::java_wxdialog(java_wxpanel* parent, int id, std::string title, int x, int y, int width, int height, long style,std::string name) : wxDialog (parent, id, wxString::FromUTF8(title.c_str()), wxPoint(x,y), wxSize(width, height), wxDEFAULT_DIALOG_STYLE, wxString::FromUTF8(name.c_str()))
{
	
}

void java_wxdialog::java_Show()
{
	wxDialog::Show();
}

void java_wxdialog::java_ShowModal()
{
	wxDialog::ShowModal();
}

void java_wxdialog::java_Center()
{
	wxDialog::Center();
}

void java_wxdialog::java_Center(int direction)
{
	wxDialog::Center(direction);
}