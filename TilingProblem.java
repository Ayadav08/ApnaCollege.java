public class TilingProblem {
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        //vertical
        int f1 = tilingProblem(n-1);
        int f2 = tilingProblem(n-2);
        int totWays = f1 + f2;
        return totWays;
    }

    public static  void main(String args[]){
        System.out.println(tilingProblem(4));
    }
}
