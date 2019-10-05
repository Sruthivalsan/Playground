import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   int a,b,area,p;
    Scanner sc=new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
    area = a * b;
    p = 2 * (a + b);
    
    System.out.println(p +"m");
    System.out.println(area +"sqm");
    
    
    
  }
}