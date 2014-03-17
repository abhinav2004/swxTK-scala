#include <wx/wx.h> 
#include "../include/java_wxbutton.h"

void java_CallOnClick(java_wxbutton* director)
{
	director->OnClick();
}

java_wxbutton::java_wxbutton(java_wxpanel* parent, int id, std::string title, int x, int y, int width, int height, long style,std::string name) : wxButton (parent, id, wxString::FromUTF8(title.c_str()), wxPoint(x,y), wxSize(width, height), style, wxDefaultValidator, name)
{
	this->Bind(wxEVT_BUTTON, &java_wxbutton::click_event_occured, this);
}

void java_wxbutton::click_event_occured(wxCommandEvent& event)
{
	java_CallOnClick(this);
}