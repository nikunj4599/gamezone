import java.awt.*;
import java.awt.event.*;
class Tf extends Applet implements ActionListener
{
	public static void main(String args[])
	{
		Frame f=new Frame("Operator");
		Button b1=new Button(" + ");
		b1.setBounds(50,100,95,30);
		f.add(b1);
		f.setSize(50,50);
		f.setLayout(null);
		f.setVisible(true);
		b1.addActionListener(this);
		
		Button b2=new Button(" - ");
		b2.setBounds(100,150,95,30);
		f.add(b2);
		f.setSize(50,50);
		f.setLayout(null);
		f.setVisible(true);
		b2.addActionListener(this);
		
		TextField tf1=new TextField();
		tf1.setBounds(150,200,105,40);
		f.add(tf1);
		f.setSize(100,100);
		f.setLayout(null);
		f.setVisible(true);
		
		TextField tf2=new TextField();
		tf2.setBounds(200,250,105,40);
		f.add(tf2);
		f.setSize(100,100);
		f.setLayout(null);
		f.setVisible(true);
		
		TextField tf3=new TextField();
		tf3.setBounds(250,300,115,50);
		f.add(tf3);
		f.setSize(100,100);
		f.setLayout(null);
		f.setVisible(true);
		
	     public void actionPerformed(ActionEvent e)
		 {
			 String s1=tf1.getText();
		String s2=tf2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(e.getSource()==b1)
		{
			c=a+b;
		}
		else if(e.getSource()==b2)
		{
			c=a-b;
		}
		String result=String.valueOf(c);
		tf3.setText(result);
		 }
	}
}