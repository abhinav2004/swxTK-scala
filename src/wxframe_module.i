%include "std_string.i"
%include "various.i"
%include "enums.swg"
%javaconst(1);
%apply char **STRING_ARRAY { char *argv[] }
%module wxframe_module
%{
	#include <wx/wx.h>
	#include "../include/java_wxframe.h"
%}
%include "../include/java_wxmenubar.h"
%include "../include/java_wxframe.h"