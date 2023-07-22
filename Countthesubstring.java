import java.util.HashMap;
 
class Countthesubstring{

static int countSubstring(String S, int N)
{
     
    HashMap<Integer, Integer> prevSum = new HashMap<>();

    int res = 0;
 
    // Stores the sum obtained so far
    int currentSum = 0;
 
    for(int i = 0; i < N; i++)
    {
         
        // If the character is uppercase
        if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')
        {
            currentSum++;
        }
 
        // Otherwise
        else
            currentSum--;

        if (currentSum == 0)
            res++;
        if (prevSum.containsKey(currentSum))
        {
             
            
            res += prevSum.get(currentSum);
        }
 

        prevSum.put(currentSum,
                    prevSum.getOrDefault(currentSum, 0) + 1);
    }
    return res;
}
 
// Driver Code
public static void main(String[] args)
{
    String S = "ankit";
    System.out.println(countSubstring(S, S.length()));
}
}