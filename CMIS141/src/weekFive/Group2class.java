package weekFive;

public class Group2class {
	static final int ARRAYSIZE =5;
    private double[] numbers = new double [ARRAYSIZE];

    // Default Constructor
    public Group2class () {
          numbers[0] = 1.0;
          numbers[1] = 1.1;
          numbers[2] = 20.3;
          numbers[3] = 0.1;              
          numbers[4] = 0.5;
        }

        // Constructor method
        public Group2class (double[] num) {
        for  ( int j = 0; j < num.length; j++)
            numbers [j] = num[j];
        }

        // Index method
        public int Index() {
            double min = numbers[0];
            int index=0;
            for(int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
                index=i;
            }
            } 
            
   
    return index;
    } // End Index method
		
}//Class