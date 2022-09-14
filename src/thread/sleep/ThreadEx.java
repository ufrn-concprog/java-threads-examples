package thread.sleep;

/**
 * Class representing a thread by extending the
 * {@link java.lang.Thread} class
 * @author <a href="mailto:everton.cavalcante@ufrn.br">Everton Cavalcante</a>
 */
public class ThreadEx extends Thread {
	/** Time for which the thread will be suspended */
	protected long time;
	
	/**
	 * Parameterized constructor
	 * @param name Name to be assigned to the thread
	 * @param time Time for which the thread will be suspended
	 */
	public ThreadEx(String name, long time) {
		super(name);
		this.time = time;
	}
	
	/** Statements to be executed when the thread runs */
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
