import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a,b,c,i;
      Scanner sc=new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      for(i = 1; i <= b; i++)
      {
        c = i * a;
        System.out.println(i + "*"+a + "="+c);
        
      }
      
      
    }
}