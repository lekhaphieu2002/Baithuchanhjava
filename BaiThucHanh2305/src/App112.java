import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class App112{public static void main(String[] args) {
    String tenSinhVien, thongTin = null;
    String arrThongTin[];   // mảng lưu trữ thông tin sinh viên
    double diemSinhVien;
         
    // lưu trữ danh sách sinh viên
    LinkedList<String> danhSachSV = new LinkedList<>();
         
    // lưu trữ danh sách sinh viên thi lại
    LinkedList<String> svThiLai = new LinkedList<>();
         
    // lưu trữ danh sách sinh viên có điểm cao nhất
    LinkedList<String> svDiemCao = new LinkedList<>();
         
    // lưu trữ danh sách sinh viên cần tìm
    LinkedList<String> svCanTim = new LinkedList<>();
         
    Scanner scanner = new Scanner(System.in);
         
    // thêm danh sách sinh viên
    // nếu tên sinh viên khác rỗng thì còn nhập
    // ngược lại không nhập nữa
    do {
        System.out.println("Nhap vao ten sinh vien: ");
        tenSinhVien = scanner.nextLine();
        if (!tenSinhVien.isEmpty()) {
            System.out.println("Nhap vao diem sinh vien: ");
            diemSinhVien = Double.parseDouble(scanner.nextLine());
            thongTin = tenSinhVien + "\t" + diemSinhVien;
            danhSachSV.add(thongTin);
        }
    } while (!tenSinhVien.isEmpty());   // khi tên còn khác rỗng thì còn nhập
         
    // hiển thị số sinh viên
    // và thông tin của các sinh viên có trong danh sách
    System.out.println("So sinh vien có trong danh sach = " + (danhSachSV.size()));
    System.out.println("Thong tin cua cac sinh vien vua nhap la: ");
    System.out.println("Ten sinh vien\t Diem");
    Iterator<String> iterator = danhSachSV.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
         
    // đếm số sinh viên phải thi lại 
    // và lưu thông tin những sinh viên đó vào trong svThiLai
    for (int i = 0; i < danhSachSV.size(); i++) {
        // lấy sinh viên tại vị trí i trong danhSachSV
        String sv = danhSachSV.get(i);  
 
        // chuyển đổi chuỗi sv thành mảng
        // mảng arrThongTin sẽ chứa tên và điểm của sinh viên đó
        arrThongTin = sv.split("\t");
             
        // arrThongTin[1] sẽ tương ứng với điểm của sinh viên
        // vì nó có kiểu là String nên phải ép kiểu về Double
        // sau đó gán vào biến point
        double point = Double.parseDouble(arrThongTin[1]);
             
        // nếu point <= 5 thì sẽ thêm sinh viên đó
        // vào trong svThiLai
        if (point <= 5) {
            svThiLai.add(sv);
        }
    }
             
    if (svThiLai.isEmpty()) {
        System.out.println("Khong co sinh vien phai thi lai!");
    } else {
        System.out.println("So sinh vien phai thi lai = " + (svThiLai.size()));
        System.out.println("Thong tin cua cac sinh vien phai thi lai la: ");
        System.out.println("Ten sinh vien\t Diem");
        iterator = svThiLai.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
         
    double maxTemp = 0; // số điểm lớn nhất
    int i = 0;  // chỉ số của phần tử

    while (i < danhSachSV.size()) {
        arrThongTin = danhSachSV.get(i).split("\t");
       
        if (Double.parseDouble(arrThongTin[1]) >= maxTemp) {
            maxTemp = Double.parseDouble(arrThongTin[1]);
        }
        i++;
    }
 
    i = 0;
    while (i < danhSachSV.size()) {
        arrThongTin = danhSachSV.get(i).split("\t");
   
        if (Double.parseDouble(arrThongTin[1]) == maxTemp) {
            svDiemCao.add(danhSachSV.get(i));
        }
        i++;
    }
         
    System.out.println("Thong tin cua cac sinh vien co diem cao nhat la: ");
    System.out.println("Ten sinh vien\t Diem");
    iterator = svDiemCao.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }

    System.out.println("Nhap ten sinh vien can tim: ");
    String search = scanner.nextLine();
         
    i = 0;
    while (i < danhSachSV.size()) {

        arrThongTin = danhSachSV.get(i).split("\t");
        tenSinhVien = arrThongTin[0];
             
        if (search.equalsIgnoreCase(tenSinhVien)) {
            svCanTim.add(danhSachSV.get(i));
        }
             
        i++;    
    }
         
    System.out.println("Thong tin cua cac sinh vien ten la " + search + ": ");
    System.out.println("Ten sinh vien\t Diem");
    iterator = svCanTim.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}
}
