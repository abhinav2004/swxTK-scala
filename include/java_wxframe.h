#include "java_wxmenubar.h"

class java_wxframe : public wxFrame {
public:
	java_wxframe(java_wxframe* parent, int id, std::string title, int x, int y, int width, int height, long style, std::string name);
	void java_Show(bool val);
	void java_Center();
	void java_Center(int direction);
	void java_SetMenuBar(java_wxmenubar *menubar);
};

