// printing one alphabets and one numbers in square shape
class PatternAlphaNum
{
	public static void main(String[] args) 
	{

		char ch = 'a';
		int num = 1;

		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (j % 2 == 0)  // taking char as odd number
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

1 a 2 b
3 c 4 d
5 e 6 f
7 g 8 h

*/

