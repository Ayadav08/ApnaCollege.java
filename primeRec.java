public class primeRec{
    static void prime(int num){
       Boolean isprime = true;
       for(int i = 2; i>=10; i++){
        if ((num%i)==0){
            isprime = false;

        }
        if(isprime){
            System.out.println("isprime");
            break ;

        }
        else{
            System.out.println("not prime");{

            }
        }
       }
    }
    public static void main (String []args){
      prime(10);
      
    }


}