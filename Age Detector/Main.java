import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int by,cy, b,d;
     Scanner sc = new Scanner(System.in); 
      by = sc.nextInt();
      cy = sc.nextInt();
      if(cy > by)
      {
         b = cy - by;
        System.out.println(b);
      }
      else
      {
       d = 100 - by;
        d=d+cy;
        System.out.println(d);
      
    }
}
}