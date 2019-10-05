import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {Scanner sc=new Scanner(System.in);
     int n = sc.nextInt();
     if(n > 85)
     {
       System.out.printf("A");
       
     }
     else if( n >= 75)
     {
       System.out.printf("B");
     }
     else if( n >= 65)
     {
       System.out.printf("C");
     }
     else if( n >= 55)
     {
       System.out.printf("D");
     }
     else if( n >= 45)
     {
       System.out.printf("E");
     }
     else
     {
       System.out.printf("Fail");
     }
    }
}