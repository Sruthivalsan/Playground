import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,c,d,e,sum;
        float avg;
      Scanner sc=new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = sc.nextInt();
      e = sc.nextInt();
      sum = a+b+c+d+e;
      avg = (float)sum / 5;
      System.out.println(avg);
      
    }
}