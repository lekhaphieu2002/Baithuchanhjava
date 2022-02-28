package com.example.Baithuchanh2802;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args)  {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Moi nhap so nguyen  n: ");
        n = sc.nextInt();
        if(n<2){
            System.out.println("Khong la so nguyen to.\n");
        }else {
            int i;
            int mark = 1;
            for(i = 2; i <= n; i++) {
                if(n % i == 0) {
                    mark = 0;
                    break;
                }
            }
            if(mark == 1) {
                System.out.println(" La so nguyen to.\n");
            }else{
                System.out.println(" Khong la so nguyen to.\n");
            }
        }
    }
    
}
