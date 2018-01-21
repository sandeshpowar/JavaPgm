package com.scp.looping;

public class JavaLoopingConcepts {
	
	
	public void m1(){
		
	}
	
	public static boolean m2(){
		return true;
	}
	
	public static void main(String[] args) {

		//iterativeStatements();
		//transferStatements();
		questionAnswer();
		
		
		/**
 * 
 * UserChoice --
 * CaseLabel --
 * 
 * 
 * 1.4 -- byte short int char
 * 1.5 -- 1.4 feature + Byte Short Integer Character + Enum
 * 1.7 -- 1.5 features + String
 * 
 * Userchoice variable dt should be exctaly same as your case labels
 * 
 * Case lable should not duplicate
 * 
 * Switch condition without break statements is called as fall-through switch
 * 
 * if there are multiple if else-- performance wise it's not good
 * 
 */
		
		int i=7;
		switch(i){
		case 1:
			System.out.println("this is 1");
			break;
		case 2:
			System.out.println("this is 2");
			break;
		case 3:
			System.out.println("this is 3");
			break;
		case 4:
			System.out.println("this is 4");
			break;
		case 5:
			System.out.println("this is 5");
			break;
		default :
			System.out.println("this defualt");
			break;		}
		
		
		/**
		 * 
		 * we can write if condition without curley braces-- that time single immediate 
		 * line will be inside the condition 
		 * 
		 * if no curley braces declarative is stament is not allowed
		 * 
		 * if..else
		 * 
		 * if....else if.
		 * 
		 * if
		 * 
		 * if elseif .......elseif else
		 *
		 * 80
		 * 
		 * if(i==1)
		 * 		sysout(1)
		 * else if(i==2)
		 * 		sysout(2)
		 *...
		 *...
		 *..
		 *else if(i==100)
		 *	sysout(100)
		 */
		
		
		/**
		 * Types of looping
		 * 	 1.Selective (ek hi baar)
		 * 			-- if..else
		 * 			-- Switch
		 *   2.Iterative (--multiple whenever contion is satified)
		 *   		--for loop
		 *   		--for each loop
		 *   		-- while
		 *   		-- do..while
		 *   3.Transfer (Transfer the execution)
		 *   		--return
		 *   		--break
		 *   		--continue
		 *   		--try
		 *   		--catch
		 *   		--finally
		 */
		
		
	}

	
	private static void questionAnswer() {
/*		String s1 = new String("A"); //110
		String s2 = new String("A"); //3012
		String s3 = s1;//110
		
		System.out.println(s1==s2); //false  == ref equality == memory location is same or not
		System.out.println(s1.equals(s2)); //true
		System.out.println(s3==s1); //true
		System.out.println(s3.equals(s1)); //true  --String class
		*/
		
		Student st1=  new Student(1,"A"); //10212
		Student st2=  new Student(1,"B"); //2123123
		Student st3= st2; //2123123

		//System.out.println(st1==st2); //false  == ref equality == memory location is same or not
		//System.out.println(st3==st2); //true  == ref equality == memory location is same or not
		/**
		 * Object equals == 
		 * Equals override aur apka implention
		 * 
		 * ==  ref
		 * = assignement
		 * 
		 * 
		 * 
		 */
		
		
		System.out.println(st1.equals(st2)); //false
		//System.out.println(st3.equals(st2)); //true
		
	}

	
	
	
	
	

	public static void transferStatements(){
		
		/**
		 *return
		 * break  -- break the current loop
		 * continue  -- skip the current iteration
		 */
		
		
/*	for(int j=0;j<3;j++){
		System.out.println("J --"+j);//2  -- 0 --9
		if(j==2)
			break;
		for(int i=0;i<10;i++){
			System.out.println("I --"+i);
			if(i==7)
				break;
		}
	}
*/		
		
		
		for(int i=0;i<10;i++){
			System.out.println("I --"+i);
			
			if(i==7)
				continue;
			
		}
		
	}
	
	
	
	
	public static void iterativeStatements(){
	
		int [] num = {10,203,40,28,45,21};
		/**
		 * 
		 * Array is nothing but an object in a java which holds
		 * hogomoneous data element
		 * 
		 * Array size should be specificed at the time declartion itselt
		 * 
		 * Array is fixed in size-- we cannnot grow or shrink up the size at runtime
		 * 
		 */
		
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		
		for(int item:num){
			System.out.println(item);
		}
		
		
		
		/**
		 * For 
		 * Foreach -- 1.5

		 * while  -- if you don't know no of iteration in advance
		 * do..while  -- ek bar to execution to hoga hi hoga
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		/**
		 * 
		 * curley braces optional, without curley one line will be inside the loop
		 * and that should not be declarative statement
		 *
		 *Recommendation not mandatory
		 *if you know the number of interation in advance that you should go for for-loop 
		 * 
		 * #1 -- Initization Section
		 * 		---Optional
		 * 		-- you can write any valid java statment
		 * 		-- sabse pahle-- once
		 * 		-- can have as many as variables but should be of same type
		 * #2 -- Conditoinal Statements
		 * 		--optional -- defualt true
		 * 		-- we can any java statement provided that it should return boolean type
		 * 		-- till that time condition is satified
		 * #3 -- Increatement/decrement
		 * 		--optional
		 * 		-- you can write any valid java statment
		 * 		-- till that time condition is satified
		 * 		
		 */
		
	}
	
	
}




class Student{
	int studId;

	String Studname;
	
	
	
	public Student(int studId, String studname) {
		super();
		this.studId = studId;
		Studname = studname;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	Student st = (Student)obj;
	if(!this.Studname.equals(st.Studname))
		return false;
	if(this.studId!=st.studId)
		return false;
	
	return true;
	}
	
	
	
	
}













