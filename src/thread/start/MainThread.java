package thread.start;

public class MainThread {
	public static void main(String[] args) {
		ThreadEx thread1 = new ThreadEx("Thread1");
		ThreadEx thread2 = new ThreadEx("Thread2");
		
		thread1.start();
		thread2.start();
	}
}
