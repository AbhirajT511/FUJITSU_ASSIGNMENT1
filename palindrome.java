import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,rem,reverse=0;
		n=sc.nextInt();
		int actual_value = n;
		while(n!=0)    
		  {    
		     rem=n%10;    
		     reverse=reverse*10+rem;    
		     n=n/10;    
		  }
		if(actual_value == reverse)
		{
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
