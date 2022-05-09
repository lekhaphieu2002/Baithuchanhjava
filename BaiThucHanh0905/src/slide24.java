import java.util.ArrayList;
import java.util.Scanner;

public class slide24{
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n;
        do{
            System.out.println("Nhap so phan tu cua List: ");
            n = sc.nextInt();
        }while(n <= 0);

        int number;
        System.out.println("Nhap cac phan tu cua List: ");
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrListInteger.add(number);
        }

        int max = arrListInteger.get(0);
        for(int i = 0; i < n; i++) {
            if(arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }

        System.out.println("Phan tu lon nhat trong List: " + max);
    }
}