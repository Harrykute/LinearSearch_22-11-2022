public class Practice6 {
    
   public static void main(String[] args) {

    int a[][] = {  { 1,2,3 },
                   {3,2,5},

                   

    };
    int ans=Integer.MIN_VALUE;

    for(int i=0;i<a.length;i++){
        int sum=0;
        

       

        for(int j=0;j<a[i].length;j++){

            sum=sum+a[i][j];

        }
        if(sum>ans){
            System.out.println(sum);
        }
        

        
       
    }
    


   }

}
