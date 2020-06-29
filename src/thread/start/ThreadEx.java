package thread.start;

public class ThreadEx extends Thread {

	public ThreadEx(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Hi, my name is " + this.getName());
	}
}
