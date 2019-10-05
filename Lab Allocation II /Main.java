import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int x,y,z;
      String f;
      Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
       f = sc.nextLine();
      if((x < y && x > z) ||(x > y && x < z))
      {
        
      
          System.out.println("L1");
        }
      if((y < x && y > z) ||(y > x && y < z))
      {
        
      
          System.out.println("L2");
        
        }
      if((z < y && z > x) ||(z > y && z < x))
      {
        
      
          System.out.println("L3");
        }
          
      
      
    }
}
    
