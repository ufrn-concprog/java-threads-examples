package thread.vvolatile;

/**
 * Demonstration of the use of volatile variables as for a
 * weak synchronization between Java threads
 * @author <a href="mailto:everton.cavalcante@ufrn.br">Everton Cavalcante</a>
 */
public class VolatileTest {
	/** Global volatile variable to be shared between the threads */
	private volatile static int var_volatile = 0;
	
	/** 
	 * Class representing a thread by extending the
	 * {@link java.lang.Thread} class.
	 * This thread reads the value of the volatile variable.
	 */
	static class Thread1 extends Thread {
		/** Statements to be executed when the thread runs */
		@Override
		public void run() {
			int var_local = var_volatile;
			while (var_local < 5) {
				if (var_local != var_volatile) {
					System.out.println("[Thread1] Getting value: " + var_volatile);
					var_local = var_volatile;
				}
			}
		}
	}
	
	
	/** 
	 * Class representing a thread by extending the
	 * {@link java.lang.Thread} class.
	 * This thread writes a value on volatile variable.
	 */
	static class Thread2 extends Thread {
		/** Statements to be executed when the thread runs */
		@Override
		public void run() {
			int var_local = var_volatile;
			while (var_volatile < 5) {
				System.out.println("[Thread2] Incrementing to " + (var_local+1));
				var_volatile = ++var_local;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	/**
	 * Main method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		// Creating the thread objects
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		// Running the threads
		thread1.start();
		thread2.start();
		
		try {
			// Setting the main thread to wait for the others have been finished
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
