import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.applet.*;

class SampleFrame extends Frame
{
    SampleFrame(String title)
    {
        super(title);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
    public void paint(Graphics g)
    {
        g.drawString("This is frame window", 10, 40);
    }
}
class MyWindowAdapter extends WindowAdapter
{
    SampleFrame sampleFrame;
    public MyWindowAdapter (SampleFrame sampleFrame)
    {
        this.sampleFrame=sampleFrame;
    }
    public void windowClosing(WindowEvent we)
    {
        sampleFrame.setVisible(false);
    }
}
public class Appl3 extends Applet {
    Frame f;
    public void init()
    {
        f=new SampleFrame("A Frame Window");
        f.setSize(250,250);
        f.setVisible(true);
    }
    public void start(){f.setVisible(true);}
    public void stop(){f.setVisible(false);}
    public void paint(Graphics g){
        g.drawString("This is an applet window", 10, 20);
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
    <applet width=200 height=200 code="Appl3.java"></applet>
 </body>
 </html>
 */