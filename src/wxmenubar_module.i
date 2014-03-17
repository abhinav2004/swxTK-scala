%include "std_string.i"
%include "various.i"
%include "enums.swg"
%javaconst(1);
%apply char **STRING_ARRAY { char *argv[] }
#pragma SWIG nowarn=401
%module(directors="1") wxmenubar_module
%{
	#include <wx/wx.h>
	#include "../include/java_wxmenubar.h"
%}
%feature("director") java_wxmenuitem;
%include "../include/java_wxmenubar.h"
