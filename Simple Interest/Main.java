import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int p,n;
      float r,prdt;
      Scanner sc= new Scanner(System.in);
         p = sc.nextInt();
         n = sc.nextInt();
         r = sc.nextFloat();
        prdt = (p * n* r) / 100;
      System.out.println(prdt);
        
        
    }
}