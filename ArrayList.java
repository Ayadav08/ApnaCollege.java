public class ArrayList {
    public static void getEvenOdd( int[]a){
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
         for(int i=0; i<a.length; i++){
            if(a[i]%2 == 0){
                even.add(a[i]);
            }
            else{
                odd.add(a[i]);
            }
            for(int i=0;i<odd.size(); i++){
                System.out.println(odd.get(i)+ " ");}
                    for(int i=0;i<even.size(); i++){
                        System.out.println(even.get(i)+ " " );}
                    }
                }
            }
        }
    }
    
}
