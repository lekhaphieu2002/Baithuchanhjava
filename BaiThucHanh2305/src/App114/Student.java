package App114;

import java.util.Scanner;

public class Student {
    public int MaSV;
    public String HoTen;
    public String Lop;
    Scanner sc = new Scanner(System.in);

    public Student(int maSV, String hoTen, String lop) {
        this.MaSV = maSV;
        this.HoTen = hoTen;
        this.Lop = lop;
    }

    public Student() {
        this.MaSV = 0;
        this.HoTen = "";
        this.Lop = "";
    }

    public int getMaSV() {
        return MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getLop() {
        return Lop;
    }

    public void nhapSV() {
        System.out.println("Enter the name: ");
        String HoTen = sc.nextLine();
        System.out.println("Enter the MaSv: ");
        int MaSv = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the Lop: ");
        String Lop = sc.nextLine();
    }
}