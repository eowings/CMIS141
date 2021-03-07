package weekSix;

/*
* Filename:    	TestClassMain.java
* Programmer:  	John Fung
* Date: 	9/26/2020
* Version:	1.0.0
* Class:  	CMIS 141
* Instructor: 	Jeffery Marcus
* Summary: 	Provide Java code for a simple class of your choice. 
* Be sure to include at least one constructor, two methods and two fields. 
* The fields should be private. Create a test class to constuct and call 
* the methods of your class.
*/



class TestClassMain {

	public static void main (String[] args) {
	 
	
		Toaster t1 = new Toaster(4,"Dark");

		int sot1 = t1.getSlicesOfToast();
		String cot1 = t1.getColorOfToast();

		System.out.println("There are " + sot1 + " in the toaster.");
		System.out.println("It will be toasted to " + cot1);

	
	}
}