import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="ohit.class" width=600 height=600>
</applet> */

public class ohit extends Applet implements ActionListener,ItemListener
{

TextField t3,t4,t5,t6,t7;
Button b1,b2;
Checkbox c1,c2,c3,c4,m,f;
CheckboxGroup cbg;
List l1;
Label l2,l3,l4,l5;
TextArea tx1;

public void init()
{ 
setLayout(null);

l2=new Label("NAME");
l2.setBounds(0,0,50,50);
add(l2); 
t3=new TextField(20);
t3.setBounds(130,10,150,20);
add(t3); 

l3=new Label("ADDRESS");
l3.setBounds(0,40,70,50);
add(l3); 
t4=new TextField(20);
t4.setBounds(130,50,150,20);
add(t4); 

l4=new Label("SEX");
l4.setBounds(0,80,70,50);
add(l4); 
cbg=new CheckboxGroup();
m=new Checkbox("male",false,cbg);
m.setBounds(130,90,75,20);
add(m);
m.addItemListener(this); 
f=new Checkbox("female",false,cbg);
f.setBounds(225,90,75,20);
add(f);
f.addItemListener(this);
l5=new Label("PURSUING");
l5.setBounds(0,120,70,50);
add(l5); 
c1= new Checkbox("GRADUATE");
c1.setBounds(80,130,100,20);
add(c1);
c1.addItemListener(this);
c2= new Checkbox(" POST GRADUATE");
c2.setBounds(180,130,130,20);
add(c2);
c2.addItemListener(this);
c3= new Checkbox("UNDER GRADUATE");
c3.setBounds(310,130,130,20);
add(c3);
c3.addItemListener(this);
c4= new Checkbox("PROFESSIONAL");
c4.setBounds(450,130,130,20);
add(c4);
c4.addItemListener(this);
l5=new Label("LANGUAGE KNOWN");
l5.setBounds(0,160,120,50);
add(l5);
l1=new List(4,true);
l1.add("C");
l1.add("C++");
l1.add("JAVA");
l1.add(".NET");
l1.add("FORTRAN");
l1.add("PHP");
l1.add("JAVASCRIPT");
l1.add("C#");
l1.add("COBOL");
l1.setBounds(130,170,150,80);
add(l1);

b1= new Button("SUBMIT");
b1.setBounds(150,280,70,20);
add(b1);
b1.addActionListener(this);
b2= new Button("RESET");
b2.setBounds(300,280,70,20);
add(b2);
b2.addActionListener(this);
tx1=new TextArea("",10,20,TextArea.SCROLLBARS_BOTH);
tx1.setBounds(0,350,600,100);
add(tx1);

}
/*public void paint(Graphics g){
Color q1= new Color(255);
g.setBackGround(q1);
}*/
String selections[];
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
tx1.insert(t3.getText()+"*********",0);
tx1.insert(t4.getText()+"**********",0);
}

String msg= new String("");
if(e.getSource()==b2){

tx1.setText(msg);
t3.setText(msg);
t4.setText(msg);
}
String outString=new String("you selected");
if(e.getSource()==b1){
selections=l1.getSelectedItems();
for(int loop=0;loop<selections.length;loop++)
{ outString +=" " + selections[loop];
}
tx1.insert(outString,0);
}
}
public void itemStateChanged(ItemEvent e){
tx1.insert(((Checkbox)e.getItemSelectable()).getLabel() + "clicked**********",0);

} 
}