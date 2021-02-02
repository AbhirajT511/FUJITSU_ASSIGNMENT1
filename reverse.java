import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,rem,reverse=0;
		n=sc.nextInt();
		while(n!=0)    
		  {    
		     rem=n%10;    
		     reverse=reverse*10+rem;    
		     n=n/10;    
		  }    
		System.out.print(reverse);
	}

}
