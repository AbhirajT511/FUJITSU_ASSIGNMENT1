import java.util.Scanner;

public class firstnterms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nterm=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			nterm=i*i*i;
			System.out.print(nterm + " ");
		}
	}

}
