%include "std_string.i"
%include "various.i"
%include "enums.swg"
%javaconst(1);
%apply char **STRING_ARRAY { char *argv[] }
%import(module="wxmenubar_module") "../include/java_wxmenubar.h"
#pragma SWIG nowarn=401
%module wxframe_module
%{
	#include <wx/wx.h>
	#include "../include/java_wxframe.h"
%}
%include "../include/java_wxframe.h"