package thread.start;

/**
 * Class representing a thread by extending the
 * {@link java.lang.Thread} class
 * @author <a href="mailto:everton@dimap.ufrn.br">Everton Cavalcante</a>
 */
public class ThreadEx extends Thread {
	/**
	 * Parameterized constructor
	 * @param name Name to be assigned to the thread
	 */
	public ThreadEx(String name) {
		super(name);
	}
	
	/** Statements to be executed when the thread runs */
	@Override
	public void run() {
		System.out.println("Hi, my name is " + this.getName());
	}
}
