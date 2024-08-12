package Syncronization;

  class counter{
	int cnt;
	public synchronized void increment() {
		cnt =+1;
	}
	}
public class Counter1{
		public static void main(String[] args) {
			counter c1 = new counter();
			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=1;i<=1000;i++) {
						c1.increment();					}
				}
				
			});
			
			Thread t2 = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=1;i<=1000;i++) {
						c1.increment();					}
				}
				
			});
			t2.start();
			t1.start();
			try {
				t1.join();
				t2.join();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(c1.cnt);
		}
}


