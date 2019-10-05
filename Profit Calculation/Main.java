import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int x,a,b,m,s;
      Scanner sc=new Scanner(System.in);
        x = sc. nextInt();
       a = sc. nextInt();
      b =  sc.nextInt();
      m = (x * a) - (x * b);
      s = m - 100;
      System.out.println("The profit obtained is Rs." + s);
      
      
      
	}
}