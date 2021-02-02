
public class floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j, rows=3;
		while(i<3)
		{
			for (i = 1; i <= rows; ++i)
			{
				for (j = 1; j <= i; ++j)
				{
					System.out.print("* ");
					
				}
				System.out.print("\n");
			}
		}
	}

}
