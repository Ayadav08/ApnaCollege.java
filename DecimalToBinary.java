//1st Approach

public class DecimalToBinary {
    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum = (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
    System.out.println("binary form of" + myNum +" = "+ binNum);
    }
 
    public static void main(String[] args){
        System.out.println("binToDec(10101");
    }
    
}

// 2nd Approach;

import java.io.*;
 
class DecimalToBinary{
{
    // function to convert decimal to binary
    public static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
  
        // counter for binary array
        int i = 0;
        while (n > 0)
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
  
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
     
    // driver program
    public static void main (String[] args)
    {
        int n = 17;
          System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
          decToBinary(n);
    }
}
}