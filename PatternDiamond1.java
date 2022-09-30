//import java.util.Scanner;
class  PatternDiamond1
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println(" Enter number to print stars :");
		//int n = sc.nextInt();

		int n=11;
		int space=n/2;
        int star=1;

		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for (int k=1;k<=star;k++)
			{
				System.out.print("*"+" ");
			}
			if (i<=n/2)
			{
				space--;
				star=star+2;
			}
			else{
				space++;
				star=star-2;
			}
			System.out.println();
		}
	}
}

/* output


          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
* * * * * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *

*/