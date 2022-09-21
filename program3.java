/*
Write a multi-threaded program, where one thread finds all prime numbers between 1 to 100
and another thread finds all palindrome numbers from 1 to 100. Schedule these thread in a 
sequential manner to get the results. 
 */
class program3
{
 public static void main(String args[])throws Exception
 {
  Thread tobj1 = new Thread(new Prime());
  tobj1.start();
  tobj1.join();
 
  Thread tobj2 = new Thread(new Palindrome());
  tobj2.start();
  tobj2.join();
 }
}

class Prime implements Runnable
{
 public void run()
 {
  System.out.println("Prime Numbers are : ");
  
  int j=0;
  for(int i=2;i<=100;i++)
  {
   for(j=2;j<=(i/2);j++)
   {
    if(i%j==0)
    {
     break;
    }
   }
   if(j==(i/2)+1)
   {
    System.out.print(i+" ");
   }
  }
 }
}
class Palindrome implements Runnable
{
 public void run()
 {
  System.out.println();
  System.out.println("__________________________________________________________");
  System.out.println("Palindrome Numbers are : ");
  for(int i=1;i<=100;i++)
  {
   int iNo=i,idigit=0,iRev=0;
   while(iNo!=0)
   {
    idigit=iNo%10;
    iRev=(iRev*10)+idigit;
    iNo=iNo/10;
   }
   if(i==iRev)
   {
    System.out.print(i+" ");
   }
  }
  System.out.println();
 }
}
