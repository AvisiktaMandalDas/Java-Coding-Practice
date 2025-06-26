class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
       
        switch(choice){
            case 1: 
                double radius=arr.get(0);
                return Math.PI*Math.pow(radius,2);
             
            case 2: 
                double length=arr.get(0);
                double breadth=arr.get(1);
                return length*breadth;
              
            default:
                return -1;
        }
    }
}
            