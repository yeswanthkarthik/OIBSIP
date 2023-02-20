import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class Guessnum extends Frame implements ActionListener
{
int val,i;
TextArea t=new TextArea();
TextArea t1=new TextArea();
Button b=new Button("Generate a number");
Button b1=new Button("Guess number");
void m1()
{
add(b);
add(t);
add(b1);
add(t1);
b.setBounds(40,100,120,40);
t.setBounds(180,100,200,40);
b1.setBounds(40,225,120,40);
t1.setBounds(180,211,200,70);
b.addActionListener(this);
b1.addActionListener(this);
setTitle("Guess the number");
setSize(400,400);
setLayout(new BorderLayout());
setBackground(Color.PINK);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
{
Random r=new Random();
val=r.nextInt(1,100);
t.setText("Number is Generated");
}
else if(e.getSource()==b1)
{
for(i=1;i<=10;i++)
{
String n=JOptionPane.showInputDialog("Enter Number");
int num=Integer.parseInt(n);
if(num==val)
{
t1.setText("Your guess is correct"+"\n"+"your score is"+" "+(100-((i-1)*10))+'\n'+"you won "+ (10-(i-1)) +" points");
break;
}
else if(num<val)
{
t1.setText("Guess larger number");
}
else if(num>val)
{
t1.setText("Guess lower number");
}
}
if(i==11)
{
t1.setText("The generated number is "+val+"\nyour score is 30"+"\nyou lost the game");
}
}
}
public static void main(String ar[])
{
Guessnum g=new Guessnum();
g.m1();
}
}