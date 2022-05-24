import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.in;

public class App110 {
    public static void main(String[] agrs){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner p = new Scanner(in);
        int number;
        System.out.print("nhập số phần tử của mảng: ");
        int n = p.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("nhập phần tử "+ i + ":");
            number = p.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);
        for(int i=1;i<n;i++){
            while(max<arrListInteger.get(i)){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: "+max);
        int num;
        System.out.print("Nhap so can xoa: ");
        num = p.nextInt();
        for(int i=0;i<arrListInteger.size();i++){
            if(num==arrListInteger.get(i))arrListInteger.remove(i);
        }
        System.out.println("so phan tu con lai trong mang: " + arrListInteger);
        arrListInteger.sort(Comparator.naturalOrder());
        System.out.println("Mang sap xep theo thu tu tang dan: " + arrListInteger);
        arrListInteger.sort(Comparator.reverseOrder());
        System.out.println("Mang sap xep theo thu tu giam dan: " + arrListInteger);
    }
}