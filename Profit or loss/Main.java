import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float x,y,a;
      Scanner sc=new Scanner(System.in);
      x = sc.nextFloat();
      y = sc.nextFloat();
      a = y * 12;
      if(a == x)
      {
       System.out.printf("No profit nor loss");
      }
      else if(a > x )
      {
        a = a - x;
        System.out.printf("Profit : Rs.%.2f",+a);
      }
      else if( a < x){
     x = x -a;
        System.out.printf("Loss : Rs.%.2f",+x);
      }
      
    }
}