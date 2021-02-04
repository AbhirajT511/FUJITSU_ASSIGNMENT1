import java.util.Scanner;

public class twolargetssmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		int largest1, largest2, temp;
		 
		largest1 = array[0];
		largest2 = array[1];
 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			else if (array[i] > largest2 && array[i] != largest1)
			{
				largest2 = array[i];
			}
		}
 
		System.out.println (largest1);
		System.out.println (largest2);
		
		int smallest1, smallest2;
		temp=0;
		smallest1=array[0];
		smallest2=array[1];
		if(smallest1>smallest2)
		{
			temp=smallest2;
			smallest2=smallest1;
			smallest1=temp;
		}
		for(int i=2;i<array.length;i++)
		{
			if(array[i]<smallest1)
			{
				smallest2=smallest1;
				smallest1=array[i];
			}
			else if(array[i]<smallest2 && array[i]!=smallest1)
			{
				smallest2=array[i];
			}
		}
		System.out.println(smallest1);
		System.out.println(smallest2);  
	}


}
