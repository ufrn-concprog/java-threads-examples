package thread.start;

/**
 * Main program
 * @author <a href="mailto:everton@dimap.ufrn.br">Everton Cavalcante</a>
 */
public class MainThread {
	/**
	 * Main method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		// Creating the thread objects
		ThreadEx thread1 = new ThreadEx("Thread1");
		ThreadEx thread2 = new ThreadEx("Thread2");
		
		// Running the threads
		thread1.start();
		thread2.start();
	}
}
