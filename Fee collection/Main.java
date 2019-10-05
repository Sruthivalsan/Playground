import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       String stype;
      int tf,bf,hf;
      float fee;
      Scanner sc= new Scanner(System.in);
      stype = sc.nextLine();
      tf =sc.nextInt();
        bf =sc.nextInt();
        hf =sc.nextInt();
        
     //System.out.println(stype);
    
      
      if(stype.equalsIgnoreCase("MSDS"))
      {
        fee = tf + bf ;
        System.out.println(fee);
      }
      else if(stype.equalsIgnoreCase("MSH"))
      {
        fee = tf + hf;
        System.out.println(fee);
      }
      else if(stype.equalsIgnoreCase("MGSDS"))
      {
        fee = (150 * tf)/100;
        fee=fee+bf;
        System.out.println(fee);
      }
      else if(stype.equalsIgnoreCase("MGSH"))
      {
        fee = ((150 * tf)/100) + hf;
        System.out.println(fee);
      }
      
      
      
    }
}