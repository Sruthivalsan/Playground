import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,pow,i;
      Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
      for(i = 1; i <= n; i ++)
      { 
        pow = i * i;
        System.out.printf("%d " ,pow);
      }
	}
}