import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int a;
      String s;
      Scanner sc=new Scanner(System.in);
      a = sc.nextInt();
      s = a % 2 == 0 ? "Even":"Odd";
      System.out.println(s);
      
        
    }
}