package thread.start;

/**
 * Class that extends {@link java.lang.Thread} to represent a thread
 * @author Everton Cavalcante
 */
public class ThreadEx extends Thread {
	
	/**
	 * Parameterized constructor
	 * @param name Name to be assigned to the thread through the superclass
	 */
	public ThreadEx(String name) {
		super(name);
	}
	
	
	/**
	 * Method to be executed when the thread runs
	 */
	@Override
	public void run() {
		System.out.println("Hi, my name is " + this.getName());
	}
}
