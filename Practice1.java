public class Practice1{

    // linear search algorithm 

    public static int getmin(int number[]){ // take one static method to get min no from given array 


        int min=number[0]; // assume first no is min && you can also use +infinity no for compare no 

        // then traverse the array to find target no on which index

        for(int i=0;i<number.length;i++){

            

            if(number[i]<min){ //check condition for each element from array 



                min=number[i]; //store the no and in min if it is small from aother element
            }


        }
        return min;  // return min to main method call




    }
    public static void main(String[] args) {
        

        int [] number= { 5,6,8,9,7,10,99};



       System.out.println( getmin(number)); // calling method and print th eminimum no from given no
    }






}