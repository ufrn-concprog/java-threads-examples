package thread.start;

/**
 * Main program
 * @author Everton Cavalcante
 */
public class MainThread {
	public static void main(String[] args) {

		// Creating thread objects
		ThreadEx thread1 = new ThreadEx("Thread1");
		ThreadEx thread2 = new ThreadEx("Thread2");
		
		// Running threads
		thread1.start();
		thread2.start();
	}
}
