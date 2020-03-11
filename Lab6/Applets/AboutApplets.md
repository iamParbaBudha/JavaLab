# Java Applet Basics
#### Life cycle of an applet :

It is important to understand the order in which the various methods shown in the above image are called. When an applet begins, the following methods are called, in this sequence:

1.init( )
2.start( )
3.paint( )
When an applet is terminated, the following sequence of method calls takes place:

1.stop( )
2.destroy( )
Let’s look more closely at these methods.

1.init( ) : The init( ) method is the first method to be called. This is where you should initialize variables. This method is called only once during the run time of your applet.
2.start( ) : The start( ) method is called after init( ). It is also called to restart an applet after it has been stopped. Note that init( ) is called once i.e. when the first time an applet is loaded whereas start( ) is called each time an applet’s HTML document is displayed onscreen. So, if a user leaves a web page and comes back, the applet resumes execution at start( ).
3.paint( ) : The paint( ) method is called each time an AWT-based applet’s output must be redrawn. This situation can occur for several reasons. For example, the window in which the applet is running may be overwritten by another window and then uncovered. Or the applet window may be minimized and then restored.
paint( ) is also called when the applet begins execution. Whatever the cause, whenever the applet must redraw its output, paint( ) is called The paint( ) method has one parameter of type Graphics. This parameter will contain the graphics context, which describes the graphics environment in which the applet is running. This context is used whenever output to the applet is required.
Note: This is the only method among all the method mention above, which is parametrised. It’s prototype is public void paint(Graphics g) where g is an object reference of class Graphic.

#### Creating Hello World applet :

```
/ A Hello World Applet 
// Save file as HelloWorld.java 
  
import java.applet.Applet; 
import java.awt.Graphics; 
  
// HelloWorld class extends Applet 
public class HelloWorld extends Applet  
{ 
    // Overriding paint() method 
    @Override
    public void paint(Graphics g)  
    { 
        g.drawString("Hello World", 20, 20); 
    } 
      
} 
```
#### appletviewer with java source file
```
/ A Hello World Applet 
// Save file as HelloWorld.java 
  
import java.applet.Applet; 
import java.awt.Graphics; 
  
/* 
<applet code="HelloWorld" width=200 height=60> 
</applet> 
*/
  
// HelloWorld class extends Applet 
public class HelloWorld extends Applet  
{ 
    // Overriding paint() method 
    @Override
    public void paint(Graphics g)  
    { 
        g.drawString("Hello World", 20, 20); 
    } 
      
} 
```