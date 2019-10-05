import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,i,j;
      float a=1;
      Scanner sc=new Scanner(System.in);
      n = sc.nextInt();
      for(j=0;j<n;j++){
      double s=a*(.5);
        System.out.print(s+" ");
        a=a*3;
      }
	}
}