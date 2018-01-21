package com.scp.selenium.eight;

public class TestSuperThis {

	public static void main(String[] args) {
		Child c = new Child();///
	}
}


class Parent {
	
		static { System.out.println("inside parent sb1");}
	
	 { System.out.println("inside Parent Ib3");}
	 
	 public Parent(){
		 //super()
		 //this()
		 
		 
		 System.out.println("inside parent constructor4");
	 }
	 
}

class Child extends Parent{
	static { System.out.println("inside child sb2");}
	
	{ System.out.println("inside child Ib5");}
	
	public Child(){
		//super();
		 System.out.println("inside child constrcor6");
	 }
	
	
	public Child(int i){
		super();
		 System.out.println("inside child constrcor6");
	 }
}


/**
 * Super -- refers to parent
 * This -- refers to current obj
 * 
 * 
 * super()
 * this()
 * () -- Constrcutor calling
 * 		-- you can only inside constructor
 * 		-- at a time ek hi use kr skte ho
 * 
 * 
 * super.
 * this.
 * 		-- you can write inside constrcuct or instance areas -- but not inside 
 * 			static block or method
 * 			-- you can write both not a problem
 * 
 * 
 * super and this keywords -- static method mein chalte nh
 * 
 * 
 * 
 * 
 */


















