import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b;
      Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
      if(a > b)
      {
        System.out.println( a + " greater than " + b);

      }
      else if(a < b)
      {
        System.out.println( a + " less than " + b);
        }
      else if( a == b)
      {
        System.out.println(a  +  " and " +  b  +  " are equal");
      }
    }
}