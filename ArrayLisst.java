class Test{
    public static void main(String [] args)
 {
    Scanner s = new Scanner(System.in);
    int n= s.nextInt();
    int[]a = new int[n];
    for(int i=0;i<n; i++)
    {
        a[i] = s.nextInt();
    }
    int x = s.nextInt();
    ArrayList<Integer> ans = SmallNum(a,x);
    for (int i=0; i< ans.size(); i++)
    {
        System.out.print(ans.get(i)+ " ");
    }
 }
}