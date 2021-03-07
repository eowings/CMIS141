package weekSix;
//////////////////////////////////////////////////////
// File Name: TestHeadPhone.java
// Author: Eddy Owings
// Date: 09/26/2020
// Description: To test HeadPhone class
/////////////////////////////////////////////////////
import java.awt.Color;

public class TestHeadPhone {
    
    public static void main(String[] args) {
        //HeadPhoneOne
        System.out.print("noiseMakerOne: "); 
        HeadPhone noiseMakerOne = new HeadPhone();
        noiseMakerOne.setVolume(1);
        System.out.print("\ngetVolume(): " + noiseMakerOne.getVolume());
        noiseMakerOne.setPluggedIn(true);
        System.out.print("\ngetPluggedIn(): " + noiseMakerOne.getPluggedIn());
        noiseMakerOne.setManufacturer("Beats");
        System.out.print("\ngetManufacturer(): " + noiseMakerOne.getManufacturer());
        noiseMakerOne.setHeadPhoneColor(Color.red);
        System.out.print("\ngetHeadPhoneColor: " + noiseMakerOne.getHeadPhoneColor());
        noiseMakerOne.setHeadPhoneModel("Solo3");
        System.out.print("\ngetHeadPhoneModel(): " + noiseMakerOne.getHeadPhoneModel());
        noiseMakerOne.changeVolume(3);
        System.out.print("\n" + noiseMakerOne.toString());
        //HeadPhoneTwo
        System.out.print("\nnoiseMakerTwo: "); 
        HeadPhone noiseMakerTwo = new HeadPhone(); 
        noiseMakerTwo.setVolume(2);
        System.out.print("\ngetVolume(): " + noiseMakerTwo.getVolume());
        noiseMakerTwo.setPluggedIn(true);
        System.out.print("\ngetPluggedIn(): " + noiseMakerTwo.getPluggedIn());
        noiseMakerTwo.setManufacturer("Panasonic");
        System.out.print("\ngetManufacturer(): " + noiseMakerTwo.getManufacturer());
        noiseMakerTwo.setHeadPhoneColor(Color.black);
        System.out.print("\ngetHeadPhoneColor: " + noiseMakerTwo.getHeadPhoneColor());
        noiseMakerTwo.setHeadPhoneModel("RP-HT161-K");
        System.out.print("\ngetHeadPhoneModel(): " + noiseMakerTwo.getHeadPhoneModel());
        noiseMakerTwo.changeVolume(3);
        System.out.print("\n" + noiseMakerTwo.toString());
        //HeadPhoneThree
        System.out.print("\nnoiseMakerThree: "); 
        HeadPhone noiseMakerThree = new HeadPhone(); 
        noiseMakerThree.setVolume(3);
        System.out.print("\ngetVolume(): " + noiseMakerThree.getVolume());
        noiseMakerThree.setPluggedIn(true);
        System.out.print("\ngetPluggedIn(): " + noiseMakerThree.getPluggedIn());
        noiseMakerThree.setManufacturer("JBL");
        System.out.print("\ngetManufacturer(): " + noiseMakerThree.getManufacturer());
        noiseMakerThree.setHeadPhoneColor(Color.white);
        System.out.print("\ngetHeadPhoneColor: " + noiseMakerThree.getHeadPhoneColor());
        noiseMakerThree.setHeadPhoneModel("TUNE 700BT");
        System.out.print("\ngetHeadPhoneModel(): " + noiseMakerThree.getHeadPhoneModel());
        noiseMakerThree.changeVolume(1);
        System.out.print("\n" + noiseMakerThree.toString());
        //Default
        HeadPhone noiseMakerDefault = new HeadPhone();
        System.out.print("\nnoiseMakerDefault ");
        System.out.print("\ngetVolume(): " + noiseMakerDefault.getVolume());
        System.out.print("\ngetPluggedIn(): " + noiseMakerDefault.getPluggedIn());
        System.out.print("\ngetManufacturer(): " + noiseMakerDefault.getManufacturer());
        System.out.print("\ngetHeadPhoneColor: " + noiseMakerDefault.getHeadPhoneColor());
        System.out.print("\ngetHeadPhoneModel(): " + noiseMakerDefault.getHeadPhoneModel());
        System.out.print("\n" + noiseMakerDefault.toString());
        
    }//End Main


}//End Class
