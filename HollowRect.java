class HollowRect 
{
	public static void main(String[] args) 
	{

		int n=4;
		int m=5;
          //outer loop
		for (int i=1;i<=n;i++ ){
			//inner loop
			{	for (int j=1;j<=m;j++)
				// cell ->(i,j)
			   //condition
			if( i == 1 || j == 1 || i == n || j == m){  
				System.out.print("*"); //print Stars in one line 
			}
	        else {
					System.out.print(" ");//print space
				}
			}
			System.out.println(); // for printing stars in next line
		}
    }
}




/*
    Using Nested Loop 

           ->colums=5(m=5)       
              *****
Rows=4(n=4)-> *   *
              *   *
              *****  

rows -> outer loop
columns-> inner loop

star printed on boundries ( i=1 , j=1 , i=n , j=m)

*/