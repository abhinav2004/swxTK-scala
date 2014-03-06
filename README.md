<h1>swxTK</h1>
<p>
swxTK is simple to use GUI toolkit for Java. It tries to use the same syntax as that of Swing but uses the awesome power of native GUI libraries like GTK, MSW (Windows) and Cocoa (Macintosh) provided by one of my favorite projects,<b>wxWidgets</b>.
</p>

<p>
To know more about wxWidgets, please visit <a href="http://www.wxwidgets.com">http://www.wxwidgets.com</a>
</p>

<h1>How does swxTK work?</h1>
Its fairly simple. The following three components are used:
<ul>
<li>wxWidgets 3.0 (the C++ part)</li>
<li>Java AWT Event Handler (the Java part)</li>
<li>SWIG (Simple Wrapper and Interface Generator, or the communicator.)</li>
</ul>

<h5>The working:</h5>
wxWidgets uses native libraries which can be used to make GUIs through C++. First, a wrapper library is created around the existing wxWidgets library. Then, using SWIG a Java wrapper is generated which can use the wrapper library. Once the Java wrapper is ready, pure Java functions and Class is made manually which call the native functions. 

<h1>Progress Report</h1>

<ul>
<li></li>
</ul>
