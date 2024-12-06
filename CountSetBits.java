import java.util.*;
public class CountSetBits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=10;
        int count=0;
        while(p>=0)
        {
            if((a&(1<<p))!=0)
            {
            count++;
            }
            p--;
        }
        System.out.println(count);
    }
}