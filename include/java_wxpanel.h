#include "java_wxframe.h"

class java_wxpanel : public wxPanel {
public:
	java_wxpanel(java_wxframe* parent, int id, int x, int y, int width, int height, long style, std::string name);
	
};

