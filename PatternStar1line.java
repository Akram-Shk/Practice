// printing stars in one line
class PatternStar1line
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if ( i  == 1)  // taking char as odd number
				{				
				System.out.print("*"+" ");
				}
			}
			System.out.println();// printing on next line
			
		}

		
	}
}

/* output

* * * *





*/

