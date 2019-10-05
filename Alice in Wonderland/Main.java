import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,sum=0,a;
      Scanner sc=new Scanner(System.in);
      n = sc.nextInt();
     
      a = n % 10;
         n = n / 10;
      sum =a+ n;
     
      
      System.out.println("Alice must go in path-" + sum);
	}
}