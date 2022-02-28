package com.example.Baithuchanh2802;
import java.util.Scanner;

public class App6 {
	public static boolean check(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so:");
		int n=sc.nextInt();
		System.out.println("cac so hoan hao nho hon "+n+" la: ");
		for(int i=1;i<n;i++)
		{
			if(check(i))
			{
				System.out.print(i+" ");
			}
		}
		
		
	}

}