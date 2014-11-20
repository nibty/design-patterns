package com.nibty.designpatterns.singleton;

public class Singleton {
	
	// Holder of the single instance for the singleton class
	private static Singleton uniqueInstance = null;
	
	/**
	 * No other class can instantiate a singleton
	 */
	protected Singleton() {
		System.out.println("Create singleton instance");
		setUniqueInstance(this);
	}
	
	/**
	 * Create a singleton instance
	 * 
	 * Use synchronized to allow only one instance when usign multiple threads
	 */
	private synchronized static void createInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
	}

	/**
	 * Access method to get hold of singleton instance
	 * @return the one unique singleton instance
	 */
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			createInstance();
		}
		return uniqueInstance;
	}

	/**
	 * Setter for uniqueInstance
	 * @param uniqueInstance
	 */
	private static void setUniqueInstance(Singleton uniqueInstance) {
		Singleton.uniqueInstance = uniqueInstance;
	}
	
	/**
	 * Example singleton public method
	 */
	public void helloSingleton() {
		System.out.println("Hello I'm a singleton");
	}
}
