#include <wx/wx.h>
#include "../include/java_wxmenubar.h"

/* 
 * wxMenuBar and member functions 
 */

java_wxmenubar::java_wxmenubar(long style) : wxMenuBar(style) {}

void java_wxmenubar::java_Append(java_wxmenu* menu, std::string name)
{
	this->Append(menu, wxString::FromUTF8(name.c_str()));
}

/* 
 * wxMenu and member functions 
 */

java_wxmenu::java_wxmenu(long style) : wxMenu(style) {}

void java_wxmenu::java_Append(int id, std::string name)
{
	this->Append(id, wxString::FromUTF8(name.c_str()));
}

void java_wxmenu::java_Append(java_wxmenuitem* menuitem)
{
	this->Append(menuitem);
}

void java_wxmenu::java_Bind(java_wxmenuitem *menuitem)
{
	this->Bind(wxEVT_COMMAND_MENU_SELECTED, &java_wxmenuitem::click_event_occured, menuitem);
}

/* 
 * wxMenuItem and member functions 
 */

void java_CallOnClick(java_wxmenuitem* director)
{
	director->OnClick();
}

java_wxmenuitem::java_wxmenuitem(java_wxmenu* menu, int id, std::string name) : wxMenuItem(menu, id, wxString::FromUTF8(name.c_str())) 
{
	menu->Bind(wxEVT_COMMAND_MENU_SELECTED, &java_wxmenuitem::click_event_occured, this);
}

void java_wxmenuitem::click_event_occured(wxCommandEvent& event)
{
	if(this->GetId() == event.GetId())
		java_CallOnClick(this);
	else
		event.Skip();
}