/*package com.scp.selenium.eight.oop;

public class TestOOP {
	
	public static void main(String[] args) {

		//Vehicle v = new Vehicle(); no obj for abstract class
		*//**
		 * A -- Parent
		 * B -- child
		 * 
		 * AA  -- abstract 
		 * BB  --
		 * AB  -- 
		 * BA   -- this is not possible
		 * 
		 * 1.Check ref and write methods
		 * Rule one wale methods -- 
		 *//*
		BMW b1 = new BMW();
		b1.m1(); //m1 bmw
		b1.m2(); // m2 bmw
		b1.bmwMethod(); //bmw
		
		Audi a1 = new Audi();
		a1.m1();//m1 audi
		a1.m2(); // vehicle
		a1.audiMethod(); //audi
		
		
		Vehicle v1 = new BMW();
		v1.m1(); //bmw
		v1.m2(); //bmw
		
		
		Vehicle v2 = new Audi();
		v2.m1();//m1 audi
		v2.m2(); //m2 vehiile
		
		
		*//**
		 * 1.First identify the methods present into ref
		 * 2 whatever methods that you have identified in rule one
		 * 	chekc thoes methods in runtime object if present call that 
		 * 	or else call ref method
		 * 
		 * Method overriding  --
		 * 
		 * 
		 * Should have two classes with parent child relationship
		 * 
		 * Method sign == should be name
		 * 
		 * AM -- child class method access modifer should be wider than parent class method
		 * not applicable for private
		 * 
		 * Return type
		 * 		1.4 --- return type exactly same
		 * 		1.5  -- 1.4 feature + 
		 * 			 -- Covariant return type	
		 * 					-- parent metohd RT X
		 * 					Child Method can be X
		 * 					or else it's child
		 * 
		 * method ka name -- exactly same
		 * params -- exactly same
		 * 
		 * 
		 * 
		 * p
		 * 	   m1()
		 * 	
		 * C
		 * 	   m1()
		 * 
		 * 
		 * m1
		 * m1(int)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *//*
		
		
	}

}



*//**
 * @Vehicle -- 	@m1  
 * 				m2
 * 
 * BMW  -- #m1  -- inside bmw
 * 		   #m2  -- inside bwm
 * 		   bmwMethod -- bmw
 * Audi  #m1
 * 		 m2
 * 		 audiMethod
 * 
 * 
 * Vechile v = new vechile();
 * 
 * 
 *
 *//*


abstract class Vehicle{
	
	abstract public void m1();

	
	
	
	public void m2(){
		System.out.println("inside vechile m2 method");
	}
	
}

*//**
 * public
 * protected
 * default
 * 
 * private -- private
 * 
 *
 *//*
class BMW extends Vehicle{

	@Override
	public void m1() {
		System.out.println("inside bmw m1");
	}
	
	
	protected void m2(){
		System.out.println("inside BMW m2 method");
	}
	
	public void bmwMethod(){
		System.out.println("inside bmw method");
	}
	
}

class Audi extends Vehicle{

	@Override
	public void m1() {
		System.out.println("inside Audi m1");
	}
	
	
	public void audiMethod(){
		System.out.println("inside audi method");
	}
}


*//**
 * Abstr
 * 
 * 
 * 
 * 
 * action --  show only essential details where as hide implementation part
 * means -- focus on what but on how
 * This is decision we take after req gathering in desing phase that SRS
 *
 * Abstract class
 * 	abstract keyword is mandatory
 * 	variables by default -- No specific rule
 * 	methods -- normal ya fir abstract	
 * Private with Abstract method -- is not allowed
 * 	constructor yes we have
 *  no objects
 *  
 *  Vechile
 *  
 *  BMW extends vechile
 *  
 *  BWM()
 *  
 *  
 * Interface
 * 	abstract keyword is optional
 * 	variables by default -- public static final
 *  Methods -- only public and abstract
 * Private with Abstract method -- is not allowed
 *  No constructor
 *  no objects
 *//*




*/