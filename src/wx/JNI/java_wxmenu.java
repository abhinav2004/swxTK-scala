/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package wx.JNI;

public class java_wxmenu {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected java_wxmenu(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(java_wxmenu obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wxmenubar_moduleJNI.delete_java_wxmenu(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public java_wxmenu(int style) {
    this(wxmenubar_moduleJNI.new_java_wxmenu__SWIG_0(style), true);
  }

  public java_wxmenu(String name, int style) {
    this(wxmenubar_moduleJNI.new_java_wxmenu__SWIG_1(name, style), true);
  }

  public void java_Append(int id, String name) {
    wxmenubar_moduleJNI.java_wxmenu_java_Append__SWIG_0(swigCPtr, this, id, name);
  }

  public void java_Append(java_wxmenuitem menuitem) {
    wxmenubar_moduleJNI.java_wxmenu_java_Append__SWIG_1(swigCPtr, this, java_wxmenuitem.getCPtr(menuitem), menuitem);
  }

  public void java_Bind(java_wxmenuitem menuitem) {
    wxmenubar_moduleJNI.java_wxmenu_java_Bind(swigCPtr, this, java_wxmenuitem.getCPtr(menuitem), menuitem);
  }

}
