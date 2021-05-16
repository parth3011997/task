//tastecase  input=-1,-1,-1,0,0,2,2     output=
//tastecase inpute=1,1,1,2,2,3,3,3,3,4,5,5,6,7,7,7,11,11,15,17
//tastecase input=-10,-9,-5,-5,-5,-3,-3 output=-10,-9,-5,-3
package array; 

import java.util.Scanner;

public class removeduplicates 
{
	public static void main(String [] args)
	{
		System.out.println("please enter the size of array");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int [] array=new int[x];
		int [] temp=new int[x];
		int j=0,count=0;
		for(int i=0;i<x;i++)
		{
			array[i]=sc.nextInt();
		}
		if(x>1)
		{
			for(int i=0;i<x-1;i++) //if x=1 the loop is out of bound   
			{
				if(array[i] != array[i+1])
				{
					if(i==0)
					{
						temp[j++]=array[i];
					}
					else if(array[i-1] != array[i])
					{
						temp[j++]=array[i];
					}
				}
			}
			if(array[x-2] != array[x-1])
			{
				temp[j++]=array[x-1];
			}
			for(int i=0;i<j;i++)
			{
				System.out.println(temp[i]);
			}
		}
		else {
			System.out.println(array[x-1]);
		}

	}

}
