public class Practice3 {
    // find the index of given array and check it is present or not in given array
    
    public static int getTarget(int num[], int target){ // passing paramters array and target(it is value )

        for(int i=0;i<num.length;i++){ // traverse the array for each element

            if(num[i]==target){ // checking the condition to each element ehich is present in array

                return i; // if it is preset then return i (index of given target value)
            }
        }
        return -1; // if it is not present is array return the -1 to the main method
    }
    public static void main(String[] args) {
        
        int num[]={ 1,2,3,4,5,6,10,45,89}; // declaring the array
        int target=70; // target value Which is find in given array
        int index=getTarget(num, target); //store the method as index veriable which return -1 or i;

       if(index==-1){ // checking condition if method return -1 & if return then go into if block

        System.out.println("it is not present in array");  // if condition is true then print o/p of given statements
       }
       else{
        System.out.println("it is presnt in array"+index); // if condion is false then print statement which present in else block
       }


        
    }

    
}
