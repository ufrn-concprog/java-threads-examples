package thread.sleep;

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
		// Creating the thread objects
		ThreadEx thread1 = new ThreadEx("Thread1", 5000);
		ThreadEx thread2 = new ThreadEx("Thread2", 2500);
		ThreadEx thread3 = new ThreadEx("Thread3", 1250);
		
		// Running the threads
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
