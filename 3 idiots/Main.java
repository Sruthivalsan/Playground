import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int a,b,a1,b1;
    float mid,mid1;
    Scanner sc= new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    a1 = sc.nextInt();
    b1= sc.nextInt();
    mid = (float) (a1 + a) / 2; 
      mid1 = (float) (b1 + b) / 2;
    
    
    System.out.println("Binoy's house is located at "+"(" + mid  + "," +  mid1 +")");
  }
}