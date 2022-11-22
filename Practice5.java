public class Practice5 {
    // find the even digit og given interger array nos.

    
    public static int findDigit(int nums[] ){
        int count=0;

        for(int num : nums) {  // for each loop for accesing element
            
            if(even(num)) { // calling even method number digit even or not
                count++; 
            }
        }
        
        
        
        
        
        return count; // return count to main method call
        }

            


     
    
    public static int digit(int num) {  // creating method to count digit of each element of array
        int count=0;
        while(num>0) {
            
            
            num=num/10;
            count++;
        }
        return count;
    }
    public static boolean even(int num) { // create method to give boolean true or false  given no inter digit even or not
        int numberofDigit = digit(num);
        
        return numberofDigit%2==0; // return true or false 
    }

    public static void main(String[] args) {

        int [] num={12,3454,2,6,7896};

        System.out.println(findDigit(num)); // print the method find digit
        


    }




}
