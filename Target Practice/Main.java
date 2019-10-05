import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int  n1,n2,count = 0,sum = 0;
      Scanner sc=new Scanner(System.in);
      n1 = sc.nextInt();
     
      
      while(sum < n1)
      {
         n2 = sc.nextInt();
         count ++;
        
        sum = sum + n2;
      
        if(sum >= n1)
        {
         
           System.out.println("The number of turns is " + count);
           break;
      }
        
      
     
      }
    }
}

      
    
