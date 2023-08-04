public class XPowerN {
//     public static int power(int x, int n){
//         if(n == 0){
//             return 1;
//         }

//         int x1 = power(x, n-1);
//         int xn = x * x1;
//         return xn;
//         // return x * power(x, n-1);
//     }
//     public static void main(String args[]){
//         System.out.println(power(2, 10));

//     }

// }

public static int optimizedPower(int a, int n){
    if(n == 0){
        return 1;
    }
    int halfPower = optimizedPower(a, n/2);
    int halfPowerSq = halfPower * halfPower;
    
    // n is odd
    if(n%2 != 0){
        halfPowerSq  = a * halfPowerSq;
    }
    return halfPowerSq;
}

     public static void main (String [] args){
         int a = 5;
         int n = 10;
         System.out.println(optimizedPower(a, n));
    }
}