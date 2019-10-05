import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,i,s = 6;
      Scanner sc=new Scanner(System.in);
      n = sc.nextInt();
      if(n == 1)
      	System.out.print(s);
      else
      {  
        System.out.print(s);
      for(i = 1; i < n ; i++)
      {
        s = s + (5 * i);
        System.out.printf(" %d",s);
        
      }
      }
	}
}