import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,i = 0;
      Scanner sc=new Scanner(System.in);
      n = sc.nextInt();
      int n1=n;
      while(n > 0)
      {
        
        n = n / 10;
        i++;
        
      }
      if (i == 3)
         {n=(n%100)/10;
       
         if(n == 0)
         {
          
            System.out.println("Trendy Number");
          }
          else
          {
            System.out.println("Not a Trendy Number");
            
          }
         }
           
        
      else
        System.out.println("Not a Trendy Number");
      
      }
      
    
    }
