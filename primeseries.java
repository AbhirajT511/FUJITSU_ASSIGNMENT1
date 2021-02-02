import java.util.Scanner;
public class primeseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i, j, flag;
		int N=sc.nextInt();
		for (i = 1; i <= N; i++) 
		{ 
 
			if (i == 1 || i == 0) 
				continue; 

			flag = 1; 

			for (j = 2; j <= i / 2; ++j) 
			{ 
				if (i % j == 0)
				{ 
					flag = 0; 
					break; 
				} 
			} 

			if (flag == 1) 
				System.out.print(i + " "); 
		}
	}

}
