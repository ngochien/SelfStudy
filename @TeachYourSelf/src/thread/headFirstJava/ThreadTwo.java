package thread.headFirstJava;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		Accum a = Accum.getAccum();

		for (int i = 0; i < 99; i++) {
			a.updateCounter(1);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("two " + a.getCounter());
	}

}
