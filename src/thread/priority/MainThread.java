package thread.priority;

public class MainThread {

	public static void main(String[] args) {
		ThreadEx thread1 = new ThreadEx("Thread1", 5000);
		ThreadEx thread2 = new ThreadEx("Thread2", 2500);
		ThreadEx thread3 = new ThreadEx("Thread3", 1250);

		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(8);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
