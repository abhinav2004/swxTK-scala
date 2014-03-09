%include "std_string.i"
%include "various.i"
%include "enums.swg"
%javaconst(1);
%apply char **STRING_ARRAY { char *argv[] }
#pragma SWIG nowarn=401
%module(directors="1")  wxbutton_module
%{
	#include <wx/wx.h>
	#include "../include/java_wxbutton.h"
%}
%feature("director") java_wxbutton;
%include "../include/java_wxframe.h"
%include "../include/java_wxpanel.h"
%include "../include/java_wxbutton.h"

