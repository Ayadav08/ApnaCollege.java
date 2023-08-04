public class DuplicateString {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[] ){
          if(idx == str.length()){
            System.out.println(newStr);
            return ;
          }

          char currChar = str.charAt(idx);
          if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
          }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
          }
    }

    public static void main(String args[]){
        String str = "appnnacollege";
        removeDuplicates(str, 0,new StringBuilder(" "), new boolean[26]);
    }
    
}

// import java.util.*;
 
// class GFG
// {
//     static String removeDuplicate(char str[], int n)
//     {
//         // Used as index in the modified string
//         int index = 0;
 
//         // Traverse through all characters
//         for (int i = 0; i < n; i++)
//         {
 
//             // Check if str[i] is present before it
//             int j;
//             for (j = 0; j < i; j++)
//             {
//                 if (str[i] == str[j])
//                 {
//                     break;
//                 }
//             }
 
//             // If not present, then add it to
//             // result.
//             if (j == i)
//             {
//                 str[index++] = str[i];
//             }
//         }
//         return String.valueOf(Arrays.copyOf(str, index));
//     }
 
//     // Driver code
//     public static void main(String[] args)
//     {
//         char str[] = "geeksforgeeks".toCharArray();
//         int n = str.length;
//         System.out.println(removeDuplicate(str, n));
//     }
// }
