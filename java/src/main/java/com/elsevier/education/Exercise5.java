package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public  class Singleton 
		
		private static  Singleton instance = null;
		Object o = new Object();
	
	        private Singleton() {
			
		}
	
	public static getInstance() {
		
		if( instance == null ) {
			
			 synchronized(o) {
				 if(instance == null ) {
					instance =  new Singleton();
				 }
				
			 }
		}
		return instance;
		
	}
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
