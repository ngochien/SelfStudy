package thread.headFirstJava;

public class ThreadOne implements Runnable {

	@Override
	public void run() {
		Accum a = Accum.getAccum();
		
		for (int i = 0; i < 98; i++) {
			a.updateCounter(1000);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("one " + a.getCounter());
	}

}
