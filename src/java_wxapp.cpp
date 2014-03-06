#include <wx/wx.h>
#include "../include/java_wxapp.h"

void java_wxapp::java_OnRun()
{
	wxApp::OnRun();
}

void java_wxapp::java_OnExit()
{
	wxApp::OnExit();
}

void java_wxEntryStart(int argc, char *argv[])
{
	wxEntryStart( argc, argv );
}

void java_wxEntryCleanup()
{
	wxEntryCleanup();
}

IMPLEMENT_APP_NO_MAIN(java_wxapp)