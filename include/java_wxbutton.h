#include "java_wxpanel.h"

class java_wxbutton : public wxButton {
public:
	java_wxbutton(java_wxpanel* parent, int id, std::string title, int x, int y, int width, int height, long style, std::string name);
	virtual void OnClick() {}
	void click_event_occured(wxCommandEvent& event);
	virtual ~java_wxbutton() {}
};


