package com.nibty.designpatterns.singleton;

public class Client {

	public static void main(String[] args) {
		
		// Call helloSingleton method 
		Singleton.getInstance().helloSingleton();
		
		// Call again, but this time the same instance is used and a new instance will not be created 
		Singleton.getInstance().helloSingleton();
		
	}
}
