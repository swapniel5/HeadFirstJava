package Another;

public class addTwoMaxNumbers {
	 
    public void printTwoMaxNumbers(int[] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
       	 System.out.println("Number: "+n+" maxOne: "+maxOne+ " maxTwo: "+maxTwo);

            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
        System.out.println("Addition Number: "+(maxOne+maxTwo));
    }
     
    public static void main(String a[]){
        int num[] = {-8,-34,-78,-1,-45,-1,-99,-23};
        addTwoMaxNumbers tmn = new addTwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}