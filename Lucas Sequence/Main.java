import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int  a = 0,b = 0, c = 0,d = 1,n ,i;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      System.out.print(a + " ");
      System.out.print(b + " ");
     System.out.print(d + " ");
      
      for(i = 3; i < n; i ++)
      {
        a = b;
        b = c;
        c = d;
        d = a+b+c;
        
        System.out.print(d + " " );
 
      }
      
    }
}