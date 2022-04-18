package App71;

public class hinhTron {
    private final float Pi = 3.14f;
    private float banKinh;

    public float gatBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public float tinhChuVi() {
        return 2 * Pi * banKinh;
    }

    public float tinhDienTich() {
        return Pi * banKinh * banKinh;
    }
}