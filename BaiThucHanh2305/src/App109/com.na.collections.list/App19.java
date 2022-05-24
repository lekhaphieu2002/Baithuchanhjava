import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) {
        ArrayList<Character> arrListChars = new ArrayList<>();
        arrListChars.add('A');
        arrListChars.add('B');
        arrListChars.add('C');
        arrListChars.add('D');

        ListIterator<Character> listIterator = arrListChars.listIterator();

        System.out.println("Các phần tử trong arrListChars:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }
    }
}
