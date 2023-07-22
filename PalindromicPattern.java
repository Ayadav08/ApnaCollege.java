public class PalindromicPattern {
    public static void palindromePatternwithNumber(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //descending
            for(int j=1; j>=i; j--){
                System.out.print(j);
            }
            //ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        palindromePatternwithNumber(5);
    }
    
}
