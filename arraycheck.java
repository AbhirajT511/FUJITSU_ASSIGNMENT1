import java.util.Scanner;

public class arraycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size=0,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		size=sc.nextInt();
		int array[] = new int[size];
		System.out.println("enter the values of array");
		for(i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("enter the value to be found");
		int value=sc.nextInt();
		for(i=0;i<array.length;i++)
		{
			if(array[i]==value)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println(i+1);
		}
		else
			System.out.println("-1");
	}

}
