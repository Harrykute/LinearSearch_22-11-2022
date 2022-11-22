import java.util.*;



public class Practice4 {
    // Linear search in 2D array

    public static int[] getTarget2(int arr[][],int target2){ 

        for(int i=0;i<arr.length;i++){ // this loop for rows

            for(int j=0; j<arr[i].length;j++){//this loop for column and arr[i].length (this is calucuate the length of each rows )

                if(arr[i][j]==target2){ // check condition for each element

                   return new int[]{i,j}; // return tha value of i and j ; and here create new object (new int[]{i,j} )


                }

            }


        }
        return new int[] {-1,1}; // if this no is not present then return -1 and 1;
        

    }
    public static void main(String[] args) {
        

        int[][] arr={  { 1,2,3,4}, // create 2d array
                        { 4,5,6},
                        {7,8,9},
                        { 10,20,30,40}};



        

        int target2=10; // given value which find in given array

        int[] ans = getTarget2 (arr,target2); //create array of method to store value of array

        System.out.println("element found at index"+ Arrays.toString(ans)); // printing the values of i, and j [3,0]

        
    }




}
