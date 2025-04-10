import java.applet.*;
import java.awt.*;

public class Appl2 extends Applet{
    String msg;
    public void init()
    {
        setBackground(Color.cyan);;
        setForeground(Color.red);
        msg="Inside init()";
    }
    public void start()
    {
        msg+="Inside start()";
    }
    public void paint(Graphics g)
    {
        msg+="Inside paint()";
        g.drawString(msg,10,30);
    }
}
/*
 <!DOCTYPE html>
 <html lang="en">
 <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
 </head>
 <body>
    <applet width=300 height=700 code="Appl2.java"></applet>
 </body>
 </html>
 */
