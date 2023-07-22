//public class BinaryToDecimal {
   // public static void binToDec(int n){
       // int myNum = binNum;
       // int pow = 0;
       // int decNum = 0;

       // while(binNum > 0){
       //     int lastDigit = binNum % 10;
       //     decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
        
       //      pow++;
       //      binNum = binNum/10;  
      //  }
      //  System.out.println("decimal of " + myNum+" =" +decNum);
  //  }
   // public static void main (Strings args[]){
   //     binToDec(1010);
   // }
    
//}


class BinaryToDecimal {
    static int binaryToDecimal(int n)
    {
        int num = n;
        int dec_value = 0;
 
        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;
 
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
 
        return dec_value;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int num = 10101001;
        System.out.println(binaryToDecimal(num));
    }
}
