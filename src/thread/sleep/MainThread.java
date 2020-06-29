package thread.sleep;

public class MainThread {

	public static void main(String[] args) {
		ThreadEx thread1 = new ThreadEx("Thread1", 5000);
		ThreadEx thread2 = new ThreadEx("Thread2", 2500);
		ThreadEx thread3 = new ThreadEx("Thread3", 1250);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
