%include "std_string.i"
%include "various.i"
%include "enums.swg"
%javaconst(1);
%apply char **STRING_ARRAY { char *argv[] }
%module(directors="1") wxmenubar_module
%{
	#include <wx/wx.h>
	#include "../include/java_wxmenubar.h"
%}

/* Pretty standard so far, loading the shared object 
   automatically, enabling directors and giving the module a name. */    

// An import for the hashmap type
%typemap(javaimports) java_wxmenuitem %{
import java.util.HashMap;
import java.lang.ref.WeakReference;
%}

// Provide a static hashmap, 
// replace the constructor to add to it for derived Java types
%typemap(javabody) java_wxmenuitem %{
  private static HashMap<Long, WeakReference<$javaclassname>> instances 
                        = new HashMap<Long, WeakReference<$javaclassname>>();

  private long swigCPtr;
  protected boolean swigCMemOwn;

  public $javaclassname(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    // If derived add it.
    if (getClass() != $javaclassname.class) {
      instances.put(swigCPtr, new WeakReference<$javaclassname>(this));
    }
  }

  // Just the default one
  public static long getCPtr($javaclassname obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  // Helper function that looks up given a pointer and 
  // either creates or returns it
  static $javaclassname createOrLookup(long arg) {
    if (instances.containsKey(arg)) {
      return instances.get(arg).get();
    }
    return new $javaclassname(arg,false);
  }
%}

// Remove from the map when we release the C++ memory
%typemap(javadestruct, methodname="delete", 
         methodmodifiers="public synchronized") java_wxmenuitem {
  if (swigCPtr != 0) {
    // Unregister instance
    instances.remove(swigCPtr);
    if (swigCMemOwn) {
      swigCMemOwn = false;
      $imclassname.delete_java_wxmenuitem(swigCPtr);
    }
    swigCPtr = 0;
  }
}

// Tell SWIG to use the createOrLookup function in director calls.
%typemap(javadirectorin) java_wxmenuitem& %{
    $javaclassname.createOrLookup($jniinput)
%}

%feature("director") java_wxmenuitem;
%include "../include/java_wxmenubar.h"
