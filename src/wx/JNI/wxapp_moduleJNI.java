/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wx.JNI;

public class wxapp_moduleJNI {
  public final static native void java_wxapp_java_CallOnInit(long jarg1, java_wxapp jarg1_);
  public final static native void java_wxapp_java_OnRun(long jarg1, java_wxapp jarg1_);
  public final static native void java_wxapp_java_OnExit(long jarg1, java_wxapp jarg1_);
  public final static native long new_java_wxapp();
  public final static native void delete_java_wxapp(long jarg1);
  public final static native void java_wxEntryStart(int jarg1, String[] jarg2);
  public final static native void java_wxEntryCleanup();

	static {
		System.loadLibrary("wxapp");
	}

}
