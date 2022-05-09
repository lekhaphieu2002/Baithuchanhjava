import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {
    public static void main(String[] args) throws Exception {
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('b');
        arrListChar.add('g');
        arrListChar.add('f');
        arrListChar.add('e');
        arrListChar.add(3, 'r');

        ListIterator<Character> listIter = arrListChar.listIterator();
        System.out.println("Cac phan tu co trong danh sach la:");
        while(listIter.hasNext()){
            System.out.println(listIter.next() + "\t");
        }
    }
}
