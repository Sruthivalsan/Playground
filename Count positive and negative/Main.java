import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,count = 0,count1 = 0,i,a;
      Scanner sc=new Scanner(System.in);
     n = sc.nextInt();
      for(i = 0;i < n; i++)
          {
         a = sc.nextInt();
            if( a> 0)
            {
              count ++;
            }
        else if(a < 0)
        {
          count1 ++;
        }
        
        
          }
      System.out.println("Number of positive numbers is " + count + " and the number of negative numbers is " + count1);
      
      
      
    }
}