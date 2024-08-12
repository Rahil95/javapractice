package ThreadExamplr;

public class DemoThread {
 public static void main(String []args) throws InterruptedException {
	 Thread1 thj = new Thread1();
	  Thread2 th2 = new Thread2();
	 System.out.println(thj.getName());
	 System.out.println(thj.getPriority());
	 thj.start(); 
	 thj.join();
	 Thread th = new Thread(th2);
	 th.start();
	 System.out.println("All Thread are running");
	 
 }
 
}
