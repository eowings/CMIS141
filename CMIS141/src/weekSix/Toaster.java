package weekSix;

/*
* Filename:    	Toaster.java
* Programmer:  	John Fung
* Date: 	9/26/2020
* Version:	1.0.0
* Class:  	CMIS 141
* Instructor: 	Jeffery Marcus
* Summary: 	
*/

public class Toaster {	

 
	private int slicesOfToast = 0;
	private String colorOfToast;

    public Toaster (int sot1, String cot1) { 
		slicesOfToast = sot1;
		colorOfToast = cot1;
    	}

   	public Toaster () { 
		slicesOfToast = 2;
		colorOfToast  = "Light"; 
    	}

    	public void setSlicesOfToast(int sot1) {
		slicesOfToast = sot1;
    	}
    
   	public void setColorOfToast(String cot1) {	
		colorOfToast = cot1;
    	}

    	public int getSlicesOfToast() {
		return slicesOfToast;
    	}    

    	public String getColorOfToast() {
		return colorOfToast;
    	}

}