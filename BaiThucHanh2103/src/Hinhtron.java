import java.util.Scanner;

class Hinhtron{

        final float PI = 3.14f;
        float r;
        float cv;
        float dt;

        void nhapBankinh() {
            System.out.println("Hay nhap vao Ban kinh hinh tron: ");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextFloat();
        }

        void tinhChuvi() {
            cv = 2 * PI * r;
        }

        void tinhDienTich() {
            dt = PI * r * r;
        }

        void inChuvi() {

            System.out.println("Chu vi Hinh tron: " + cv);
        }

        void inDienTich() {

            System.out.println("Dien tich Hinh tron: " + dt);
        }
}

