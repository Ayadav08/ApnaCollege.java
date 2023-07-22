public class HollowPattern{
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for(int i=1; i<totRows; i++){
            // inner columns
            for(int j =1; j<=totCols;j++){
                //cell (i,j)
                if(i==1 || i == totRows || j==1 || j==totCols){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
    public static void main(String [] args){
         hollow_rectangle(10,7);

    }
}


// 2nd Approach.
//import java.io.*;
 
//class GFG {
     
    // Function to print hollow rectangle
   // static void print_rectangle(int n, int m)
   // {
   //     int i, j;
    //    for (i = 1; i <= n; i++)
      //  {
         //   for (j = 1; j <= m; j++)
          //  {
          //      if (i == 1 || i == n ||
           //         j == 1 || j == m)           
            //        System.out.print("*");           
            //    else
           //         System.out.print(" ");           
           // }
          //  System.out.println();
       // }
      
//}
      
    // Driver program for above function
   // public static void main(String args[])
  //  {
     //   int rows = 6, columns = 20;
     //   print_rectangle(rows, columns);
    //}
//}


//     *
      **
     ***
    ****
class invertedPrymaid{

    public static void inverted_rotated_pryamid(int n){
        for(int i =1; i<=n; i++){
            //spaces
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_rotated_pryamid(int n); // n= 7;
    }
}