class java_wxmenu;
class java_wxmenuitem;
class java_wxmenubar;


class java_wxmenubar : public wxMenuBar 
{
public:
	java_wxmenubar(long style);
	void java_Append(java_wxmenu* menu, std::string name);
};


class java_wxmenu : public wxMenu
{
public:
	java_wxmenu(long style);
	java_wxmenu(std::string name, long style);
	void java_Append(int id, std::string name);
	void java_Append(java_wxmenuitem *menuitem);
	void java_Bind(java_wxmenuitem *menuitem);
};

class java_wxmenuitem : public wxMenuItem {
public:
	java_wxmenuitem(java_wxmenu* menu, int id, std::string name);
	virtual void OnClick() {}
	void click_event_occured(wxCommandEvent& event);
	virtual ~java_wxmenuitem() {}
};