/**
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package thread;

import java.util.Date;

import Prog1Tools.IOTools;

/**
 * 
 * @author h13n
 *
 */
public class ThreadStarter {

	public static void main(String [] args) {
		
		
		Thread counter = new CounterThread();
		Runnable prt = new LetterPrinter();
		Thread printer = new Thread(prt);
		Thread input = new UserInputThread();
		System.out.println("Main-Thread starts");
		counter.start();
		DoSomething.pause(1000);
		counter.interrupt();
		System.out.println(Thread.currentThread());
		System.out.println("Main-Thread ended");
		
//		printer.start(); printer2.start(); printer3.start();
//		counter.interrupt();

		// Let's see which runner comes first
//		Thread runnerA = new RunnerThread("A");
//		Thread runnerB = new RunnerThread("B");
//		Thread runnerC = new RunnerThread("C");
//		runnerA.start();runnerB.start();runnerC.start();
//		
//		Thread runnerD = new Thread(new RunnerRunnable("D"));
//		Thread runnerE = new Thread(new RunnerRunnable("E"));
//		Thread runnerF = new Thread(new RunnerRunnable("F"));
//		runnerD.start();runnerE.start();runnerF.start();
		
	}
}
