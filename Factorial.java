public class Factorial {
    
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fa = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println(fact(n));
    }
}

// time complexity O(n)
// space complexity O(n)
