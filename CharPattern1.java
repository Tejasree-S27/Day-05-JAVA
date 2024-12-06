/* Pattern
A
A B
A B C
A B C D
A B C D E
*/
import java.util.*;
public class CharPattern1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
