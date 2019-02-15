import java.io.*;
import java.net.*;
public class Csocket
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket(Local Host,6656);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.WriteUTF("HELLO");
			dout.Fleash();
			dout.Close();
			s.Close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}