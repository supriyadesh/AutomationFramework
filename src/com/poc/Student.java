package com.poc;
/* Method Overloading:
 * 1.Method name is same.
 * 2.Count of parameters can be changed.
 * 3.same count of parameters but different datatypes.
 * 4.same datatype but sequence can be changed.
 * 5.It takes place in same class.
 * 6.Return type is not considered in it.
 * 
 * */


public class Student {

	String name;
//	int id = 0;   //assign object memory 
	static int id = 0; // assign common memory //static represents class 
	String department;
	double fees;

	static {
		System.out.println("I am static block");
		id++;
		System.out.println(id);
	}

	public Student() {
		System.out.println("i am constructor");
	}

	public Student(String name){ 
		 //this keyword is object of same class 
		 this.name = name;
		 id++;
		 /*id= id+1;
		 id+=1;*/
	 }

	public Student(String name, String department){
		 this.name = name;
		 this.department = department;
	 }

	 public Student(double fees, String name){
		 this.fees = fees;
		 this.name = name;
	 }

	 public Student(String name, double fees){
		 this.name = name;
		 this.fees = fees;
	 }

//	 protected void printStudentDetails() {
//		 System.out.println("name " + name);
//		 System.out.println("Roll no  " + id);
//	 }
//

	 public void printStudentDetails() {
		 System.out.println("parent");
		 System.out.println("name " + name);
		 System.out.println("Roll no  " + id);
	 }


}
