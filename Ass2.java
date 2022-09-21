/*
Write a program to accept value 'n' from the user. Create three different thread which 
displays the message- "Welcome to FY", "Welcome to SY" and "Welcome to TY" n
number of times with a delay of 10 seconds.  
 */
import java.lang.*;
import java.util.*;



class Demo extends Thread{
	String str;
	Demo(String str)
	{
		this.str=str;
	}
	public void run(int value){
	for(int i=0;i<value;i++){
	System.out.println(i+":"+str);
	try
	{
		Thread.sleep(1500);
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}
	}
}


class Ass2{
	public static void main(String args[])
	{
	Scanner sobj =new Scanner(System.in);
	System.out.println("enter number");	
	int no =sobj.nextInt();
	
	Demo d1 = new Demo("welcome fy");	
	Demo d2 = new Demo("welcome sy");
	Demo d3 = new Demo("welcome ty");	
	d1.run(no);	
	d2.run(no);
	d3.run(no);
	
	Thread t1 =new Thread(d1);	
	Thread t2 =new Thread(d2);

	t1.start();
	t2.start();
	}
}











