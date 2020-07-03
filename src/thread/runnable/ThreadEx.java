package thread.runnable;

/**
 * Class representing a thread by implementing the
 * {@link java.lang.Runnable} interface
 * @author <a href="mailto:everton@dimap.ufrn.br">Everton Cavalcante</a>
 */
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
	
	/** Statements to be executed when the thread runs */
	@Override
	public void run() {
		System.out.println("Hi, my name is " + this.name);
	}
}
