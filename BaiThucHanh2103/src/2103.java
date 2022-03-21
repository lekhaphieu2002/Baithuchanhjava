public class App2103 {
    public static void main(String[] args) throws Exception {
        System.out.println("****** HINH CHU NHAT *****\n");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieuDaiChieuRong();
        hcn.tinhDienTich();
        hcn.tinhChuVi();
        System.out.println("\n***********\n");
        System.out.println("Chu vi hinh chu nhat : " + hcn.getChuVi());
        System.out.println("Dien tich hinh chu nhat : " + hcn.getDienTich() );


        System.out.println("\n***********\n");


        Person ps = new Person();
        ps.nhapThongTin();
        System.out.println("\n***********\n");
        ps.inThongTin();

        System.out.println("\n****** SINH VIEN *****\n");


        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        System.out.println("\n***********\n");
        sv.inThongTin();

        System.out.println("\n****** PHUONG TRINH BAC HAI *****\n");


        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.nhap();
        pt.giaiPhuongTrinh();
        System.out.println("\n***********\n");
        pt.inKetQua();
    }
}