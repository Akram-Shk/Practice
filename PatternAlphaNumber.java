// printing one line of alphabets and one line of numbers in square shape

class PatternAlphaNumber
{
	public static void main(String[] args) 
	{

		char ch = 'a';
		int num = 1;

		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if ( i % 2 == 0)  // taking char as odd number
				{				
				System.out.print(ch+" ");  //for print character
				ch++; //increment the char variable
				}
				else {
					System.out.print(num+" ");// print numbers
					num++; // increment the number variable
				}
			}
			System.out.println();// printing on next line
			
		}

		
	}
}

/* output

1 2 3 4
a b c d
5 6 7 8
e f g h

*/

