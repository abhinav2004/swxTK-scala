%include "std_string.i"
%include "various.i"
%include "enums.swg"
%javaconst(1);
%apply char **STRING_ARRAY { char *argv[] }
%import(module="wxmenubar_module") "../include/java_wxmenubar.h"
%import(module="wxframe_module") "../include/java_wxframe.h"
%import(module="wxpanel_module") "../include/java_wxpanel.h"
#pragma SWIG nowarn=401
%module wxdialog_module
%{
	#include <wx/wx.h>
	#include "../include/java_wxdialog.h"
%}
%include "../include/java_wxdialog.h"
