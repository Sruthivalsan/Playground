import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int x,y,z,n,i= 0;
      Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
       y = sc.nextInt();
      z = sc.nextInt();
      n = sc.nextInt();
      if((n < x) &&(n > y)&&(n > z))
      {
        System.out.println("0");
      }
      else
      {
        if(x > n)
        {
          i++;
        }
        if(y > n)
        {
          i++;
        }
        if(z > n)
        {
          i++;
        }
        System.out.println(i);
      }
      
      
    }
}