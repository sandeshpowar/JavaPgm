package com.scp.selenium.eight;

public class TestStudent {
/**
 * Write a code
 * Complie with javac which is inside jdk
 * output will be .class file provided that no syntax errors
 * run with java student
 * class loadder will come into pitcure will load that class
 * at the time of loading a class --
 * 		static field will get a memory
 * 		static blocks of that class will get executed
 * 	
 * Main method will be loaded into thread stack -- execution started of main
 * #1at the time of object creation
 * 			-- instance filed will get a memory
 * 			-- instance block will be executed
 * 			-- constructor will be called
 * 
 * 
 * #1 -- will be repeated equal to no of object
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("inside main method...1");//1
		Student st1 = new Student(10,"Abc");
		Student st2 = new Student(20,"PQR");
		
		System.out.println("###########calling s1#############");
		st1.showStudentInfo();
		Student.displayInfo(st1);
		
		System.out.println("###########calling s2#############");
		st2.showStudentInfo();
		Student.displayInfo(st2);
		
	}

}

class Student {
	
	int studId;
	String studName;

	static String collegeName="PICT"; 

	public void showStudentInfo(){ //I--I
		System.out.println("inside showstudinfo");
		System.out.println("Student Id :" +studId);
		System.out.println("Student Name :" +studName);
		System.out.println("Student CollegeName :"+collegeName);
	}
	
	static public void displayInfo(Student st){
		System.out.println("\ninside display info");
		System.out.println("Student Id :" +st.studId);
		System.out.println("Student Name :" +st.studName);
		System.out.println("Student CollegeName :"+collegeName);//SS
	}
	
	static{
		System.out.println("inside static block of student2");
	}
	
	{
		System.out.println("inside instance block of student3");
	}

	/**
	 * If no constructor specified in your class, compiler will add that -- only default
	 * Name should be same as your class name
	 */
	
	
	
	public Student(){
		System.out.println("inside student constructior4");
	}

	public Student(int id, String nm) {
		this.studId = id;
		this.studName = nm;
	}
	
	
	
}













/**
 * One java file can have multiple java classes but you can have single class
 * as a public class and that class name should be your file name
 * 
 * you can have as many as nonpublic classes inside a file that time you can specify 
 * any name as your file name
 * 
 * class can be -- either public default abstract final
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
 */




