class MyThread implements Runnable
{
String str; int time;
MyThread(String s, int t)
{
str = s; 
time = t;
}
@Override
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(str + "\t" + i); try
{
Thread.sleep(time);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
class ThDemo
{
public static void main(String args[])
{
MyThread ob1 = new MyThread("Hi", 1000 ); 
MyThread ob2 = new MyThread("Hello", 2000 );
MyThread ob3 = new MyThread("Good Morning", 3000 ); 
Thread t1 = new Thread(ob1);
Thread t2 = new Thread(ob2); 
Thread t3 = new Thread(ob3); 
t1.start();
t2.start();
t3.start();
}
}


