import java.util.Scanner;

public class Person {
    String PersonID;
    String PersonName;
    String Gender;
    String Address;
    Scanner sc = new Scanner(System.in);

    public void nhapThongTin(){
        System.out.println("Nhap ID:");
        PersonID = sc.nextLine();
        System.out.println("Nhap Name:");
        PersonName = sc.nextLine();
        System.out.println("Nhap Gender:");
        Gender = sc.nextLine();
        System.out.println("Nhap Address:");
        Address = sc.nextLine();
    }

    public void inThongTin(){
        System.out.println("ID:"+ PersonID);
        System.out.println("Name:"+ PersonName);
        System.out.println("Gender:"+ Gender);
        System.out.println("ID:"+ Address);
    }

}
