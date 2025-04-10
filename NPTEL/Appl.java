import java.applet.Applet;
import java.awt.*;
public class Appl extends Applet {
    public void init(){
        resize(500, 600);
    }
    public void paint(Graphics g){
        g.drawString("Hello World!",150,150);
    }
    // public static void main(String[] args) {
        
    // }
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
    <applet width="150" height="150" codebase="." code="Appl.class"></applet>
</body>
</html>
 */