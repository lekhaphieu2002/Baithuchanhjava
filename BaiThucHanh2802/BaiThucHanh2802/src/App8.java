package com.example.Baithuchanh2802;
import java.util.Scanner;

public class App8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=0,n;
		do
		{
			System.out.println("nhap so nguyen: ");
			n=sc.nextInt();
			if(n%5==0 && n>max)
			{
				max=n;
			}
		}while(n!=0);
		System.out.println("so lon nhat chia het cho 5 trong cac so vua nhap la: "+max);
		

	}

}