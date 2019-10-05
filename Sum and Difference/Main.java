import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
            int a,b,sum = 0,diff = 0;
          Scanner sc=new Scanner(System.in);
          a = sc.nextInt();
          b = sc.nextInt();
          sum = a + b;
          diff = a - b;
          System.out.println(sum);
          System.out.println(diff);
          
        }
}