package com.poc;

public class StringOperations {
	
	String fullName = "Supriya Deshpande";
	
	public void printCharOfString() {
		int len = fullName.length();
		for(int index=1; index<len; index=index+2 ) {
		System.out.println(fullName.charAt(index)+ " " + index);
	}
		
	System.out.println("");
		for(int index=0; index<len; index=index+2 ) {
			System.out.println(fullName.charAt(index) + " " + index);
		}
	int i= 0;
	for (int index=0; index<len; index++ ) {
			if (fullName.charAt(index) == 'a' || fullName.charAt(index) == 'e' || fullName.charAt(index) == 'i' || fullName.charAt(index) == 'o' || fullName.charAt(index) == 'u') {
	
					i = i+1;
					System.out.println(fullName.charAt(index)  + " ");
			}else if(fullName.charAt(index) == 'A' || fullName.charAt(index) == 'E' || fullName.charAt(index) == 'I' || fullName.charAt(index) == 'O' || fullName.charAt(index) == 'U') {
				System.out.println(fullName.charAt(index)  + " ");
	}
	}
	System.out.println("Count" + i);
}
	
	public void StringConcat() {
		System.out.println("\n\n\n\n\n\n");
		String name = "supriya";
		System.out.println(name);
		System.out.println(name.hashCode());
//		name=name.concat("deshpande");
//		System.out.println(name);
		String name1;
		name1 = name.concat(name);
		System.out.println("\n\n\n\n\n"+name1);
		System.out.println(name1.hashCode());
		System.out.println(name.concat("deshpande"));
		System.out.println(name);
		
		System.out.println("\n\n\n\n\n");
		String fname = "supriya";
		System.out.println(fname);
		System.out.println(fname.hashCode());
		String lname = new String("supriya");
		System.out.println(lname);
		System.out.println(lname.hashCode());
	}
	public void reverseString(String str) {
		int len = str.length();
		int lasti = len-1;
		for(int i=0; i<len; i++ ) {
		System.out.println(str.charAt(lasti)+ " " + i);
		lasti--;
		}
		
		for (int index=len-1; index>=0 ; index--) {
			System.out.println(str.charAt(index));			
		}
	}

	public void handlinException() throws Exception {

		String CompanyName = "inportia";

		try {
			System.out.println("before expetion");
			System.out.println(CompanyName.length());
			System.out.println("after exception");
			System.out.println(CompanyName.charAt(0));
			Exception exp = new Exception();

			throw exp;
		}
//		catch(NullPointerException npe) {
////			npe.printStackTrace();
//			
//			System.out.println("in catch block");
//			
//		}
//		catch(StringIndexOutOfBoundsException rte) {
//			
//			System.out.println("in runtime catch block");
//		}
		finally {
			System.out.println("in my finally");
		}
	}
}
