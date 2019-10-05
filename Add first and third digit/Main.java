import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      int a,b,sum;
		Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      a = n / 100;
      b = n % 10;
      sum = a + b;
      System.out.println(sum);
	}
}