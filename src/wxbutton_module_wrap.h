/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_wxbutton_module_WRAP_H_
#define SWIG_wxbutton_module_WRAP_H_

class SwigDirector_java_wxbutton : public java_wxbutton, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_java_wxbutton(JNIEnv *jenv, java_wxpanel *parent, int id, std::string title, int x, int y, int width, int height, long style, std::string name);
    virtual void OnClick();
    virtual ~SwigDirector_java_wxbutton();
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    bool swig_override[1];
};


#endif
