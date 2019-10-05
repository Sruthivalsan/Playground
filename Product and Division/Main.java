import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int a,b,prdt = 0,qunt = 0,rem = 0;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
      prdt = a * b;
      qunt = a / b;
      rem = a % b;
      System.out.println(prdt);
      System.out.println(qunt);
      System.out.println(rem);
    }
}