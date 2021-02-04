import java.util.Scanner;

public class ascend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp=0;
		int array[]=new int[10];
		for(int i=0;i<=9;i++)
		{
			array[i]=sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {     
			for (int j = i+1; j < array.length; j++) {     
				if(array[i] > array[j]) {    
					temp = array[i];    
					array[i] = array[j];    
					array[j] = temp;    
				}     
			}     
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+ " ");
		}
	}

}
