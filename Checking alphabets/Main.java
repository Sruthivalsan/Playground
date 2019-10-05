import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        char str;
      Scanner sc=new Scanner(System.in);
      str = sc.next().charAt(0);
      if((str == 'a') || (str == 'e') || (str == 'i') || (str == 'o') || (str == 'u'))
      {
        System.out.println("Vowel");
      }
      else if((str >= 'a' )&& (str <= 'z')|| (str == 'A')||  (str == 'Z'))
      {
        
        System.out.println("Consonant");
      }
      else
        System.out.println("Not an alphabet");
      
      
      
      
      
    }
}