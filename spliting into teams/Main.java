import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  int a,b,team,qteam;
  Scanner sc=new Scanner(System.in);
  a = sc.nextInt();
  b = sc.nextInt();
  team = a / b;
  qteam = a % b;
  System.out.println("The number of students in each team is " + team+ " and left out is "+ qteam);

  
  
  
 
}
}