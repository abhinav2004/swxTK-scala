#include "java_wxframe.h"

class java_wxdialog : public wxDialog {
public:
	java_wxdialog(java_wxframe* parent, int id, std::string title, int x, int y, int width, int height, long style, std::string name);
	void java_ShowModal();
	void java_Show();
	void java_Center();
	void java_Center(int direction);
};

