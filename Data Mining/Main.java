import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int n,c = 0,sum = 0,sum1 = 0,a;
      Scanner sc=new Scanner(System.in);
      n = sc.nextInt();
     
          while(n != 0)
          {
            a = n % 10;
            if (a % 2 == 0)
            {
              sum = sum + n;
            }
            else 
            {
              sum1 = sum1 + n;
              
            }
            n = n / 10;
    }
      if(sum == sum1)
      {
        System.out.println("Yes");
      }
      else 
      {
        System.out.println("No");
      }
}
}


      
      
    
