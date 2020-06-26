package thread.runnable;

public class ThreadEx implements Runnable {
	
	/** Thread's name */
	protected String name;
	
	/**
	 * Parameterized constructor
	 * @param name Name to be assigned to the thread
	 */
	public ThreadEx(String name) {
		this.name = name;
	}
	
	
	/**
	 * Method to be executed when the thread runs
	 */
	@Override
	public void run() {
		System.out.println("Hi, my name is " + this.name);
	}
}
