import java.text.DecimalFormat;
import java.util.Scanner;
 
public class AppBai1 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhap vao so thu nhat: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int secondNumber = scanner.nextInt();
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
         
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
         
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
         
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                decimalFormat.format(thuong));  
          int phanDu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
        System.out.println("ket qua so sanh bang hai so " + firstNumber + " va " + 
                secondNumber + " là " + (firstNumber == secondNumber));
        System.out.println("Ket qua so sanh khong bang hai so " + firstNumber + " va " + 
                secondNumber + " là " + (firstNumber != secondNumber));
        System.out.println("Ket qua so sanh lon hon hai so " + firstNumber + " va " + 
                secondNumber + " là " + (firstNumber > secondNumber));
        System.out.println("Ket qua so sanh lon hon hoac bang 2 so " + firstNumber + " va " + 
                secondNumber + " là " + (firstNumber >= secondNumber));
        System.out.println("Ket qua so sanh nho hon 2 so " + firstNumber + " va " + 
                secondNumber + " là " + (firstNumber < secondNumber));
        System.out.println("Ket qua so sanh nho hon hoac bang 2 so " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber <= secondNumber));
    }
 
}