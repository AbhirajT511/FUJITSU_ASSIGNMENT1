import java.util.Scanner;

public class matadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];

		System.out.println("enter matrix A: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("enter matrix B: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}


		int c[][] = new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			
			System.out.println();
		}
	}

}
