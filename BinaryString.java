public class BinaryString {
     public static void printBinsString(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return ;
        }


        printBinsString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinsString(n-1, 1 , str+"1");
        }

     }
     public static void main(String args[]){
        printBinsString(3, 0,"");
     }
}
