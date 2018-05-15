package org.itstep;

public class AppRunner extends Object{

	public static void main(String[] args) {
		Name firstName = new Name ();
		String myName=firstName.getName("Nastya");
		
		System.out.println(myName);
		
	}

}
