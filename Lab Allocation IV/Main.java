import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int x,y,z,n,i = 0;
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();
      y = sc.nextInt();
      z = sc.nextInt();
      n = sc.nextInt();
      if((n > x)&& (n > y)&&(n > z))
      {
        System.out.println("0");
      }
      else
      {
        if(n < z)
        {
         System.out.println("L3");
        }
      
    else if(n < y)
      {
        System.out.println("L2");
      }
      else
      {
        System.out.println("L1");
      }
     
    } 
}
    }
