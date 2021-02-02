
public class firstfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int num = 0; num < 200; num++) 
		{        
			if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) 
			{
				count=count+1;
				System.out.print(num + " ");
			}	
			if(count==5)
				break;
		} 
	} 
}