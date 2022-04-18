package shapes;
import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    float dai;
    float rong;
    HinhChuNhat(){};
    Scanner sc = new Scanner(System.in);

    public void nhapChieuDai(){       
        dai = sc.nextFloat();
    };

    public void nhapChieuRong(){  
        rong = sc.nextFloat();
    };

    public void tinhChuVi(){
        chuVi = (dai + rong) * 2;
    };

    public void tinhDienTich(){
        dienTich = dai * rong;
    };
}