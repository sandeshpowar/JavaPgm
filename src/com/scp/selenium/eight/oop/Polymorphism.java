package com.scp.selenium.eight.oop;

public class Polymorphism {
	
	/**
	 * 
	 * one name many forms -- 
	 * 		method overloading
	 * 		method overriding
	 * 
	 */
	
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
	/**
	 * 
	 * byte short  int long float double
 * 		char
 * 
 *  10  --int
 *  10.0 -- double
	 */
		
		
		test1.m1(null);
		test1.m1(10.0f);
	}
}

/**
 * Method overloading can happen in same class or in two classes with parent child relnship
 * 
 * Method name should be same
 * Paremeter list should be differnet in terms of
 * 	no of params
 * 	datatype of the param
 * 	sequence of param
 * 
 * method signature == method ka name + paramters
 * 
 * Method overloading -- method signature should be diff
 * 
 * 
 * Implicit casting rule
 * Wrapper rule -- widening
 * cHECK THE REALTED PARENTS  
 * 
 *  
 *
 */

class Test1{
	
	
	public void m1(float f){
		System.out.println("inside flaot");
	}
	
	
	public void m1(String a){
		System.out.println("inside wrapper");
	}
	
	/*public void m1(Object a){
		System.out.println("inside wrapper");
	}*/
	
}









