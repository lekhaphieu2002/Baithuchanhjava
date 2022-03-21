import java.util.Scanner;
import java.lang.Math;

public class PhuongTrinhBacHai {
    float a,b,c,x1,x2,d;

    Scanner sc = new Scanner(System.in);

    
    public void nhap(){
        System.out.println("Nhap a:");
        a = sc.nextFloat();
        System.out.println("Nhap b:");
        b = sc.nextFloat();
        System.out.println("Nhap c:");
        c = sc.nextFloat();
    }

    public void giaiPhuongTrinh(){
        d = b*b - 4*a*c;
        if(d >= 0) 
        {
            x1 = (float) ((-b + Math.sqrt(d))/(2*a));
            x2 = (float) ((-b - Math.sqrt(d))/(2*a));
        }
    }

    public void inKetQua(){
        if(d < 0) 
        System.out.println("Phuong trinh vo nghiem");
        if(d==0)
        System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+x1);
        if(d>0)
        System.out.println("Phuong trinh co 2 nghiem x1 = "+x1+" x2 = "+ x2);
    }
}