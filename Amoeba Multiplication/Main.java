import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a = 0,b = 0,c = 1,n,i ;
      Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
      //b = sc.nextInt();
      //c = sc.nextInt();
      for(i = 0; i < n; i++)
      {
        a = b;
        b = c;
        c = a + b;
      }
      System.out.println(a);
        
    }
}