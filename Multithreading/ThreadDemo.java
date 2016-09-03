

class ThreadDemo implements Runnable{
public void run(){
int i;
for(i=0;i<5;i++)
{
System.out.println("ThreadDemo1 running" + i);
}
}
public static void main(String[] arr)
{
ThreadDemo demo = new ThreadDemo();
Thread thread1 = new Thread(demo);
ThreadDemo1 demo1 = new ThreadDemo1();
Thread thread2 = new Thread(demo1);
thread1.start();
thread2.start();
}

}

class ThreadDemo1 implements Runnable{
public void run(){
int i;
for(i=0;i<5;i++)
{
System.out.println("Threaddemo running" + i);
}
}
}