import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
      int b;
		Scanner sc=new Scanner (System.in);
          int n = sc.nextInt();
      b = (n /10) % 10;
      System.out.println(b);
      
	}
}