import java.util.Scanner;
 
public class AppBai3 {
 
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
          System.out.println("Nhap vao ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap vao nam sinh: ");
        year = scanner.nextInt();
        age = 2022 - year;  
        if (age < 16) {
            ageGroup = "tuoi vi thanh nien.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuoi truong thanh.";
        } else {
            ageGroup = "tuoi da gia";
        }
         
        System.out.println("ban " + name + " thuoc nhom " + ageGroup);
    }
 
}
