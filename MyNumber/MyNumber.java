class MyNumber implements Runnable 
{ 
  @Override

  public void run() 
   { 
     try 
       { 
        for(int i=1;i<=10;i++) 
        { 
          Thread.sleep(500);          
          System.out.println(i); 
        } 
        } 
       catch(InterruptedException e) 
           { 
             System.out.println("Exception..."+e); 
           } 
    } 
} 
 
class Number 
{ 
  public static void main(String [] args) 
   { 
     MyNumber m1 = new MyNumber(); 
     Thread thread = new Thread(m1); 
     thread.start(); 
   } 
} 