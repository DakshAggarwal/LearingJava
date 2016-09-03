class ThreadDemo2 extends Thread{
ThreadDemo2(String msg)
{
super(msg);
}

public void run(){
int i;
for(i = 0; i<=5 ;i++)
{
System.out.println("thread running" + this.getName());
}}
public static void main(String[] arr){
ThreadDemo2 thread1 = new ThreadDemo2("hello");
thread1.start();

}

}
  