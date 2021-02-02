import java.util.Scanner;

public class invertednum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, rows;
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		for (i = rows; i >= 1; --i) {
			for (j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}

}
