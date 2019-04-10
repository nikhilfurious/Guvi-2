import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
  String st = input.nextLine();
  for(int i=1; i<=st.length() ;i++)
       {  
            System.out.print(st.charAt(st.length()-i)); 
       }
       System.out.println();
	}
}
