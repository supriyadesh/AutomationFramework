package com.synerzip;


import com.poc.*;
import com.seleniumpoc.SeleniumExamples;

public class FirstSession {


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("hello world");

//		Student supriya; //object declaration
//		Student supriya = new Student("Supriya Deshpande");
////		Student(); 
//		supriya.printStudentDetails();
//
//		Student a = new Student("a");//implicit constructor
//		a.printStudentDetails();
//		Student b = new Student("b");
//		b.printStudentDetails();
//		Student c = new Student("c");
//		c.printStudentDetails();
//		Student d = new Student("d");
//		d.printStudentDetails();
//
//		EngineeringStudent sumit = new EngineeringStudent();
//		sumit.printStudentDetails();
//
//		Student sachin = new EngineeringStudent();
//		//runtime polymorphism
//		// child can refer to parents bt parents cannot refer to child.
//		
////		Syllabus syllabus = new Syllabus();
//		Professor prof;
//		//cannot create object of abstract class and interface.
//		Professor.assignProf();
		
//		StringOperations so = new StringOperations();
////		so.printCharOfString();
////		so.StringConcat();
////		so.reverseString("Supriya deshpande");
//		try {
//			so.handlinException();
//		} 
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
////		}
//		ListExample le = new ListExample();
//		le.addElements();
//		le.displayElements();
//		
//		SetExample se = new SetExample();
//		se.addElements();
//		se.displayElements();
		
//		addition(2,5);
//		addition(2.5,3.6);
//	
//		MapExample map = new MapExample();
//		map.addElements();
//		map.displayElements();
//		
//		FileOperation fo = new FileOperation();
//		fo.read();
//		fo.write();
		
		SeleniumExamples see = new SeleniumExamples();
//		see.launchApplication("chrome", "http://the-internet.herokuapp.com/");
//		see.login();
//		see.invalidLogin();
//		see.closeApplication();
		
//		see.launchApplication("firefox", "http://the-internet.herokuapp.com/");
//		see.login();
//		see.invalidLogin();
//		see.closeApplication();
		
//		see.launchApplication("firefox", "http://the-internet.herokuapp.com/");
//		see.selectOptionFromDropdown("index", "1");
//		see.closeApplication();
//		
//		see.launchApplication("firefox", "http://the-internet.herokuapp.com/");
//		see.selectOptionFromDropdown("value", "2");
//		see.closeApplication();
//		
//		see.launchApplication("firefox", "http://the-internet.herokuapp.com/");
//		see.selectOptionFromDropdown("visibleText", "Please select an option");
//		see.closeApplication();
//		
//		see.launchApplication("chrome", "http://the-internet.herokuapp.com/");
//		see.getAllOptionsFromDropdown();
//		see.closeApplication();
//		
//		see.launchApplication("chrome", "http://the-internet.herokuapp.com/");
//		see.getAllLinkOnHomePage();
//		see.closeApplication();
		
		see.launchApplication("chrome", "https://www.naukri.com/");
		see.getwindowTitleAndUrl();
		see.closeApplication();
		
	}
	
//
//	public void addition(int a,int b) {
//		System.out.println(a+b);
//		
//	}
//	public void addition(double a,double b) {
//		System.out.println(a+b);
//	}
	

	public static <T,E> void addition(T u,E v) {
		System.out.println(u);
		System.out.println(v);
	} 
	
	
}
