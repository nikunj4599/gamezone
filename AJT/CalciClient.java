package calculatorrmi;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import java.util.Scanner;


public class CalciClient {
    public static void main(String[] args)throws NotBoundException,MalformedURLException,RemoteException{
        Scanner sc = new Scanner(System.in);
        
        try {
            CalculatorInterface c = (CalculatorInterface)Naming.lookup("rmi://localhost:1099/Calculator");
            System.out.println("Client is connected to server");
            System.out.println("Enter your Choice :\n" 
                    +"1. Addition\n"
                    +"2. Subtraction\n"
                    +"3. Multiplication\n"
                    +"4. Division");
            int choice = sc.nextInt();
        int x,y;
        switch (choice)
        {
            case 1:
            {
                System.out.println("Enter x and y");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(c.add(x, y));
                break;
            }
            case 2:
            {
                System.out.println("Enter x and y");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(c.sub(x, y));
                break;
            }
            case 3:
            {
                System.out.println("Enter x and y");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(c.mul(x, y));
                break;
            }
            case 4:
            {
                System.out.println("Enter x and y");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(c.div(x, y));
                break;
            }
            
        }
            
        } catch (Exception e) {
        }
        
    }
}