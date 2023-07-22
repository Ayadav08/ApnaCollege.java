public class PrimeNum {
    public static boolean isPrime(int n){
        int isPrime = true;
        for(int i = 2; i<=n-1; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;


    }
    public static void main(String args[]){
        System.out.println(isPrime());
    }
    
}

// public static boolean isPrime(int n){
    // for(int i=2; i<=n-1; i++){
        //if (n%i == 0){
            //return false;
       // }
    //}
    // return true;
//}
// public static void main(String  args[]){
    // System..out.println(isPrime());
//}

// For Optimized method Number is prime or not 

// public static boolean isPrime(int n){
  //  if(n==2){
   //     return true;
   // }
   // for(int i = 2;i<=Math.sqrt(n); i++){
     //   if(n%i ==0){
       //     return false;
       // }
    //}
    //return true;
//}

//public static void main(String[] args){
   // System.out.println(isPrime(7));
//}