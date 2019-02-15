import java.awt.*;
/*public class CB
{
	public static void main(String args[])
	{
		Frame f=new Frame("Button example");
		Button b=new Button("click here");
		b.setBounds(50,100,95,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
}*/
import javax.swing.*;
public class CB
{
	static JFrame f;
	public static void main(String args[])
	{
		f=new JFrame("Button example");
		JButton b=new JButton("click here");
		b.setBounds(50,100,95,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
}
