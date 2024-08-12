package ThreadExamplr;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}

}
