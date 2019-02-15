import java.io.*;
import java.net.*;
class server
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(1201);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			string msgin=" ",msgout=" ";
			while(!msgin.equals("end"))
			{
				msgin=din.readUTF();
				System.out.println(msgin);
				msgout=br.readLine();
				dout.writeUTF();
				dout.flush();
			}
			s.close();
		}
		catch(Exception e)
		{
			System.out.println("note = "+e);
		}
	}
}