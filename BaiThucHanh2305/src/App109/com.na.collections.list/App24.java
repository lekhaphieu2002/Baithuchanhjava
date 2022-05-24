import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            number = sc.nextInt();
            list.add(number);
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }

        }
        System.out.println("Phần tử lớn nhất trong mảng: " + max);

    }
}