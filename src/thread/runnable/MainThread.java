package thread.runnable;

/**
 * Main program
 * @author <a href="mailto:everton.cavalcante@ufrn.br">Everton Cavalcante</a>
 */
public class MainThread {
	/**
	 * Main method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		// Creating the Runnable objects
		Runnable runnable1 = new ThreadEx("Thread1");
		Runnable runnable2 = new ThreadEx("Thread2");
		
		// Creating the thread objects to execute the Runnable objects
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		// Running the threads
		thread1.start();
		thread2.start();
	}

}
