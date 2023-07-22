public class countZero {
    
    static void countZero(int num, int count){
        if (num==0)
        System.out.prinntln("Count is "+count);
        return ;
}
int singleDigit = num % 10;
if (singleDigit == 0){
    count = count + 1;
}
countZero(num/10, count);
}
stativ void countZero(int num, int)