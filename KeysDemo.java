import java.awt.*;
import java.awt.event.*;
public class KeysDemo extends Frame implements KeyListener{
Label lbl;
KeyDemo(){
addKeyListener(this);
requestFocus();
lbl=new Lable();
lbl.setBounds(100,100,200,40);
lbl.setFont(newFont('Calibri',Font.BOLD,16));
add(lbl);
setSize(400,300);
set Layout(null);
setVisible(true);
}
public void keyPressed(keyEvent e){
if(e.getKeyChar()=='M'|| e.getKeyChar()=='m')
  lbl.setText("Good morning");
else if(e.getKeyChar()=='A||e.getKeyChar()=='a')
  lbl.setText("Goodafternoon");
else if(e.getKeyChar()=='N'||e.getKeyChar()=='n')  
  lbl.setText("Good night");
else if(e.getKeyChar()=='E||e.getKeyChar()=='e')
  lbl.setText("goodevening");
}
 public void keyReleased(KeyEvent e){
}
public void keyTyped(KeyEvent e){
}
public staatic void main(String[] args){
   new KeysDemo();
}}
