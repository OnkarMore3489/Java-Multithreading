/*
Write a program to accept a word and a directory name as command line arguments and
searches for word in each text file in the directory.Use separate thread for each file int the
directory. 
 */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

class program1
{
 public static void main(String args[])throws Exception
 {
  File file = new File(args[1]);

  if(file.isDirectory())
  {
   File f[] = file.listFiles();
   Searching sobj[] = new Searching[f.length];
   
   for(int i=0;i<f.length;i++)
   {
    String s=f[i].toString();
    String ch=args[0];
   
    sobj[i]=new Searching(ch,s);
    sobj[i].start();
    sobj[i].setName(f[i].getName());
   }
  }  
 }
}
class Searching extends Thread
{
 String ch;
 FileReader file=null;
 
 public Searching(String ch,String str)throws Exception
 {
  this.ch=ch;
  file=new FileReader(str);
 }
 public void run()
 {
  BufferedReader bobj = new BufferedReader(file);
  String line;
  
  try
  {
   while((line=bobj.readLine())!=null)
   {
    if(line.contains(ch))
    {
     System.out.println("Word is there in "+Thread.currentThread().getName()+" file");
     break;
    }
   }
   bobj.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
