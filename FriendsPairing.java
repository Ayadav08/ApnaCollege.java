public class FriendsPairing {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // choice
        //single

        // int f1 = friendsPairing(n-1);

        // //pair
        // int f2 = friendsPairing(n-2);
        // int pairWays = (n-1)* f2;

        // //totWays
        // int totWays = f1 + pairWays;
        // return totWays;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
        
    }
    public static void main(String args[]){
        System.out.println(friendsPairing(6));
    }
    
}
