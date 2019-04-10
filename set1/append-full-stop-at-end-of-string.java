import java.util.Scanner;
import java.lang.*;
class checker
{
    void check(String n)
    {
        System.out.println(n+'.');
    }
}

class Main
{
 public static void main(String args[]){  
Scanner sc = new Scanner(System.in);
String n = sc.nextLine();
checker o = new checker();
o.check(n);
  }
}
