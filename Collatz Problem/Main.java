import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,n,c= 0;
      Scanner sc=new Scanner(System.in);
      n = sc.nextInt();
      if (n == 1)
      {
        System.out.println(n);
      }
      else
      {
        System.out.println(n);
            while(n != 1)
             {
               if(n % 2 == 0)
               {
                 n = n / 2;
                System.out.println(n);
                    c++;
        		}
                else
                {
                  n = 3 * n + 1;
                  System.out.println(n);
                  c++;
     			 }
      		}
       }
       System.out.println(c);
    }
}
