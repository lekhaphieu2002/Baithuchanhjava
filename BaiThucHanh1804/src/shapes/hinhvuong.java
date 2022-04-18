package shapes;
import java.util.Scanner; 

public class HinhVuong extends HinhHoc{
    Scanner sc = new Scanner(System.in);
    float canh;
    HinhVuong(){};
    public void nhapCanh(){
        canh = sc.nextFloat(); 
    };
    public void tinhchuvi(){
        chuvi = 4 * canh;
    };
    public void tinhdientich(){
        dientich = canh * canh;
    };
}