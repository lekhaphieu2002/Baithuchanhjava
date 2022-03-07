package Baithuchanh0703;
import java.util.Scanner;
public class App90 {
    public static void main(String[] args)  {
        Scanner sc =new Scanner(System.in);
        String chuoi;
        char kyTu;
        System.out.println("Cac ky tu co trong chuoi la: ");
        chuoi = sc.nextLine();
        for (int i=0; i<chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}