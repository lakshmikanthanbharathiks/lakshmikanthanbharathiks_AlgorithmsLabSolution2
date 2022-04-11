package com.greatlearning.lab2.PayMoney.Main;
import java.util.Scanner;
import com.greatlearning.lab2.PayMoney.PayMoney;

public class DriverClassMain 
{
		public static void main(String[] args)
		{
			PayMoney t=new PayMoney();
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the size of transaction array");
				int size=sc.nextInt();
				int[] array=new int[size];
				System.out.println("Enter the values of array\n");
				for(int i=0;i<array.length;i++)
				{
					array[i]=sc.nextInt();
				}
				System.out.println("Enter the total number of targets that needs to be achieved");
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter the value of target"+(i+1));
					int target=sc.nextInt();
					int noOfTransaction=t.transaction(array, target);
					if(noOfTransaction==-1)
					{
						System.out.println("Given target is not achieved");
					}
					else
					{
						System.out.println("Target achieved after "+noOfTransaction+ " transactions");
					}
					
				}
			}
		}
		

	}
