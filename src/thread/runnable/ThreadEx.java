package thread.runnable;

public class ThreadEx implements Runnable {
	
	protected String name;
	
	public ThreadEx(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Hi, my name is " + this.name);
	}
}
