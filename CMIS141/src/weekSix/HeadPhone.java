package weekSix;
//////////////////////////////////////////////////////
//File Name: HeadPhone.java
//Author: Eddy Owings
//Date: 09/26/2020
//Description: A java class designed 
//             to describe a set of headphones
/////////////////////////////////////////////////////
import java.awt.Color;

public class HeadPhone {
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    private int volume;
    private boolean pluggedIn;
    private String manufacturer;
    private Color headPhoneColor;
    private String headPhoneModel;
    
    //Default Constructor
    public HeadPhone () {
        volume = MEDIUM;
        pluggedIn = false;
        manufacturer = "Sony";
        headPhoneColor = Color.black;
        headPhoneModel = "MDRZX110";
    }//End Constructor
     
    //Volume Method
    public int changeVolume(int vo) {
        switch (vo) {
        case 1:
            volume = LOW;
            break;
        case 2:
            volume = MEDIUM;
            break;
        default:
            volume = HIGH;
        }
        return volume;
    }//End Volume
    
    
    
    //Getter Method
    public int getVolume() {
        return volume;
    }//End Getter  
  
    //Getter Method
    public boolean getPluggedIn() {
        return pluggedIn;
    }//End Getter  
  
    //Getter Method
    public String getManufacturer() {
        return manufacturer;
    }//End Getter  

    //Getter Method
    public Color getHeadPhoneColor() {
        return headPhoneColor;
    }//End Getter
    
    //Getter Method
    public String getHeadPhoneModel() {
        return headPhoneModel;
    }//End Getter
    
    //Setter Method
    public void setVolume(int vo) {
        volume = vo;
    }//End Setter
  
    //Setter Method
    public void setPluggedIn(boolean plgIn) {
        pluggedIn = plgIn;
    }//End Setter
    
    //Setter Method
    public void setManufacturer(String mn) {
        manufacturer = mn;
    }//End Setter
    
    //Setter Method
    public void setHeadPhoneColor(Color color) {
        headPhoneColor = color;
    }//End Setter
    
    //Setter Method
    public void setHeadPhoneModel(String model) {
        headPhoneModel = model;
    }//End Setter
    
    //toString
    public String toString() {
        String sayPlg;
        if (pluggedIn) {
            sayPlg = "plugged in";
        } else {
            sayPlg = "unplugged";
        }
        
        return "Your " + manufacturer  + " " + 
                headPhoneModel + " headphones are currently " + 
                sayPlg + " with volume set at " +
                volume + " these headphones look great in the color " + headPhoneColor + "\n";  

    }//End toString

}//End Class
