import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseListenerExample implements MouseListener{
//create two lables Ibl1 and Ibl2 
Lable Ilb1,Ibl2;
//create a frame frame
Frame fr;
//create a string s
String s;
MouseListenerExample(){
fr= new Frame("Java Mouse Listener Example");
Ibl1= new Lable("Demo for the Mouse Event",Lable.CENTER);
Ibl2= new Lable();
//set the layout of frame as Flowlayout
fr.setLayout(new FlowLayout());
//add lable 1 to frame 
fr.add(Ibl1);
//add lable 2 to frame 
fr.add(Ibl2);
//Register the created class MouseListenerExample with MouseListener
fr.addMouseListener(this);
//set the size of the where width is 250 and height is 250
fr.setSize(250,250);
//set the visibility of frame as true 
fr.setVisisble(true);
}
//implementation of mouseClicked method 
public void mouseClicked(MouseEvent ev){
  lbl2.setText("Mouse Button Clicked");
  fr.setVisible(true);
}
//implementation of mouseEntered method
public void mouse
