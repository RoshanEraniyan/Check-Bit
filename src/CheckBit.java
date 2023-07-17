import java.util.*;

class Solution
{
    public void setbit(int n,int b)
    {
        int set=0;
        int temp=n>>b;
        if((temp&1)==1)
        {
            set=1;
        }
        System.out.println(set);

    }
}

class CheckBit
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int b=scanner.nextInt();
        Solution solution =new Solution();
        solution.setbit(n,b);
    }
}
