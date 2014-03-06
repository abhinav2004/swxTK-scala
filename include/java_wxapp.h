class java_wxapp : public wxApp
{
public:
	void java_CallOnInit();
	void java_OnRun();
	void java_OnExit();
};


void java_wxEntryStart(int argc, char *argv[]);
void java_wxEntryCleanup();

