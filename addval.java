import java.util.Scanner;
public class addval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0;
		num=sc.nextInt();
		System.out.println(getSum(num));
	}

	private static int getSum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num!=0)
		{
			sum = sum + num % 10;
			num = num/10;
		}
		return sum;
	}

}
