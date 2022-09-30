class PatternPractice 
{
	public static void main(String[] args) 
	{

		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=4;++j)
			{
				if (i==1 || j==2|| i==2 || j==1||i==3 ||j==3||i==4||j==4)
				{
					System.out.print(" "+" ");
					
				}
				//if (  i==2 || j==2||i==3 ||j==3||i==4||j==4)
				//{				
     				System.out.print("*"+" ");
				//}
				}
				System.out.println();
			}

			
			
			int n=3;
			int i;
			for (i=0;i<=n;i++)
			{
				for (int j=n;j>i;j--)
				{
					System.out.print(" "+" ");
				}
				for (int k=n;k<=i*2+1;k++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			//System.out.println();
		}
	}

