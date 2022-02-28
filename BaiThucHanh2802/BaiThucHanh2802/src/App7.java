package com.example.Baithuchanh2802;


import java.util.Scanner;

public class App7 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
            
    float n,max=0;
    do 
    {
        System.out.println("nhap so thuc: ");
        n=sc.nextFloat();
        if(n>max)
        {
            max=n;
        }
    }
    while(n!=0);
    System.out.println("so lon nhat trong cac so vua nhap la: "+max);
        
    

}

}