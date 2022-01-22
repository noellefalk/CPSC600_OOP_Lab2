package singleton;

public class Mechanic {
	private static Mechanic uniqueInstance;

	private Mechanic() {}
	
	public static synchronized Mechanic getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Mechanic();
		}
		return uniqueInstance;
	}
	
	public synchronized void assembleMotorcycle() {
		System.out.println("The mechanic has started work on the new build. It will be complete in two weeks.");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
		}
		System.out.println("Your motorcycle build is complete. Thanks for your order!");		
	}
}
