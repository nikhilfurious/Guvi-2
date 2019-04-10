import java.util.Scanner;
import java.lang.*;
class Main
{
 public static void main(String args[]){  
    int i,fact=1;  
  Scanner sc = new Scanner(System.in);
  int number = sc.nextInt();  
  if(number>0)
  {
  for(i=1;i<=number;i++)
  {    
      fact=fact*i;    
  }    
  System.out.println(fact); 
 }
 else
 {
  System.out.println(fact);
}
 }
}
