class Pattern1 
{
	public static void main(String[] args) 
	{
        int n = 76;
		int m = 90;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=m;j++)
			{
				if((j==30&&i==3)||(j==30&&i==4)||(i==5&&j==29)||(i==5&&j==30)||(i==5&&j==31)||(i==6&&j==30)||j==40||(j==50&&i==4)||(j==50&&i==3)||(i==5&&j==49)||(i==5&&j==50)||(i==5&&j==51)||(i==6&&j==50))
				{
				
	     			System.out.print("*");
				}
				else if(i==1||j==1||i==2||i==3||i==5||i==6||i==7||j==2||i==4||j==4){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
