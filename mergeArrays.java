import java.io.*;
import java.util.Scanner; 
public class mergeArrays { 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		int size1,size2;
		System.out.println("enter sizes of arrays");
		size1=sc.nextInt();
		size2=sc.nextInt();
		int a[] = new int[size1]; 
		int b[] = new int[size2]; 
		int a1 = a.length;  
		int b1 = b.length; 
		System.out.println("Enter elements of 'a': ");
		for(int i=0;i<a1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elements of 'b': ");
		for(int i=0;i<b1;i++)
		{
			b[i]=sc.nextInt();
		}
		int c1 = a1 + b1; 
		int[] c = new int[c1]; 
		for (int i = 0; i < a1; i = i + 1) 
		{  
			c[i] = a[i]; 
		}
		for (int i = 0; i < b1; i = i + 1) 
		{  
			c[a1 + i] = b[i]; 
		}  
		for (int i = 0; i < c1; i = i + 1) 
		{ 	 
			System.out.println(c[i]); 
		} 
	} 
}
