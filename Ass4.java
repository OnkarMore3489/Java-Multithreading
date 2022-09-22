/*
Define a thread called -PrintText_Thread for printing text on command prompt for n
number of times. Create three threads and run them. Pass the text and n as parameters 
to the thread constructor.
 */
import java.lang.*;
import java.io.*;
import java.util.*;

class Demo extends Thread
{
	String str,s= " ";
	int n,n1;
	Demo(String str,int n ,String s)
	{
	this.s=s;
	this.str=str;
	this.n=n;
	}

	public void run(){
	try
	{
	for(int i=0;i<=n;i++)
	{
	Thread.sleep(1000);
	System.out.println(str+" "+i+"\t\t"+s);	
	}
	}
	catch(Exception e){}
	}

}



class Ass4{

public static void main(String args[])
{

	
	Scanner sobj =new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sobj.nextInt();
	System.out.println("Enter the String");
	String s = sobj.next();
	
	

	Demo d1 = new Demo(s,n,"first thread");
	Demo d2 = new Demo(s,n,"second thread");
	Demo d3 = new Demo(s,n,"third thread");

	d1.start();
	d2.start();
	d3.start();


}

}




