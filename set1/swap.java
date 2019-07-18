import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        char t;
        int i;
        for(i=0;i<s.length();i++)
        {
         if(i%2==0)
         {
             t = a[i];
             a[i] = a[i+1];
             a[i+1] = t;
         }
        }
        for( i=0;i<s.length();i++)
        {
            System.out.print(a[i]);
        }
    
    }
}
