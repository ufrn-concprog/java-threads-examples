package thread.priority;

public class ThreadEx extends Thread {
	protected long time;
	
	public ThreadEx(String name, long time) {
		super(name);
		this.time = time;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Suspending thread " + this.getName());
			Thread.sleep(time);
			System.out.println("Resuming thread " + this.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
