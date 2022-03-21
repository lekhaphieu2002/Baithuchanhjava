import java.util.Scanner;

public class SinhVien {
    String MaSinhVien;
    String HoTen;
    String GioiTinh;
    String DiaChi;
    String NgaySinh;
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(){
        System.out.println("Nhap ma sinh vien:");
        MaSinhVien = sc.nextLine();
        System.out.println("Nhap ten:");
        HoTen = sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        GioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi:");
        DiaChi = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        NgaySinh = sc.nextLine();
    }

    public void inThongTin(){
        System.out.println("Ma Sinh Vien: "+ MaSinhVien );
        System.out.println("Ho va Ten: " + HoTen);
        System.out.println("Gioi Tinh: "+ GioiTinh);
        System.out.println("Dia Chi: " + DiaChi);
        System.out.println("Ngay Sinh : "+ NgaySinh);
    }
}
