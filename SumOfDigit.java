public class SumOfDigit{
    int sum =0;
    void sumOfDigit(int num ){
        if(num==0){
            System.out.println("Sum" + sum);
            return ;

        }
// int jha diya hoga usme integer number lega
        int singleDigit = num % 10;
        sum = sum + singleDigit;
        sumOfDigit(num/10, sum);
     }
    public static void main (String[] args){
        sumOfDigit(num: 123,sum: 0);
    }
}
