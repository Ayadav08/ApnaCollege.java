public class FloydTriangle {
    public static void floyds_triangle(int n){
        // outer lines 
        int counter = 1;
        for(int i=1; i<=n; i++){
            //inner loop - how many time will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        floyds_triangle(4);
    }
}

// 2nd Approach -


public class FloydTriangle{
    // Function to demonstrate printing pattern
    public static void printNums(int n)
    {
        // initialising starting number
        int i, j, num=1;
         
        // outer loop to handle number of rows
        // n in this case
        for(i=0; i<n; i++)
        {
 
            // without re assigning num
            // num = 1;
            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(num+ " ");
                 
                // incrementing num at each column
                num = num + 1;
            }
 
            // ending line after each row
            System.out.println();
        }
    }
     
    // Driver Function
    public static void main(String args[])
    {
        int n = 5;
        printNums(n);
    }
}