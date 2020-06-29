package thread.vvolatile;

public class VolatileTest {
	
	private volatile static int var_volatile = 0;
	
	static class Thread1 extends Thread {
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
	
	static class Thread2 extends Thread {
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

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
