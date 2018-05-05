package com.poc;

public class EngineeringStudent extends Student implements Professor, Examination{


//	public void sample() {
//		this.printStudentDetails();
//	}

	 public void printStudentDetails() {
		 System.out.println("child method");
		 System.out.println("name " + name);
		 System.out.println("Roll no  " + id);
		 System.out.println("Department  " + department);
		 System.out.println("Fees  " + fees);
	 }

	@Override
	public void exminationDetails() {
		// TODO Auto-generated method stub
	}

	@Override
	public void professorDetails() {
		// TODO Auto-generated method stub
	}

}
