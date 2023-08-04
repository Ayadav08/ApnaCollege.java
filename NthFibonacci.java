public class NthFibonacci {
    public static int fib(int n ){
        if(n == 0 || n ==1){
            return n;
        }
        int fa = fib(n-1);
        int fb = fib(n-2);
        int fn = fa + fb;
        return fn;
    }

    public static void main(String args[]){
        int n = 10 ;
        System.out.println(fib(n));
    }
}
