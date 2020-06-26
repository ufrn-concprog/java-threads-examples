package thread.runnable;

/**
 * Main program
 * @author Everton Cavalcante
 */
public class MainThread {
	public static void main(String[] args) {

		// Creating Runnable objects
		Runnable runnable1 = new ThreadEx("Thread1");
		Runnable runnable2 = new ThreadEx("Thread2");
		
		// Creating thread objects themselves
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		// Running threads
		thread1.start();
		thread2.start();
	}
}
