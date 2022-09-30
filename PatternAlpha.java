// printing alphabets in square shape
class PatternAlpha
{
	public static void main(String[] args) 
	{

		char ch = 'a';

		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}

		
	}
}

/* output

a b c d
e f g h
i j k l
m n o p

*/
