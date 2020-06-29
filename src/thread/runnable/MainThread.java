package thread.runnable;

public class MainThread {

	public static void main(String[] args) {
		Runnable runnable1 = new ThreadEx("Thread1");
		Runnable runnable2 = new ThreadEx("Thread2");
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
	}

}
