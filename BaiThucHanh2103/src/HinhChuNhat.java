import java.util.Scanner;

class HinhChuNhat {
    float chuVi,dienTich,chieuDai,chieuRong;
    Scanner sc = new Scanner(System.in);

    public void nhapChieuDaiChieuRong(){
        System.out.printf("Nhap chieu dai: ");
        chieuDai = sc.nextFloat();

        System.out.printf("Nhap chieu rong: ");
        chieuRong = sc.nextFloat();
    }

    public void setChieuDai(float chieuDai){
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(float chieuRong){
        this.chieuRong = chieuRong;
    }

    public void tinhDienTich(){
        dienTich = chieuDai * chieuRong;
    }

    public void tinhChuVi(){
        chuVi = (chieuDai + chieuRong) * 2;
    }

    public float getChuVi(){
        return chuVi;
    }

    public float getDienTich(){
        return dienTich;
    }

}