package com.example.Baithuchanh2802;

import java.util.Scanner;
 public class App5 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so muon kiem tra: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
		{
			System.out.println(n+" la so hoan thien ");
		}
		else
		{
			System.out.println(n+" khong la so hoan thien");
		}

	}

}