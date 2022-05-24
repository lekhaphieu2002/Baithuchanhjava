import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<>();
        list.add(1.0f);
        list.add(2.0f);
        list.add(3.0f);
        list.add(4.0f);

        Iterator<Float> iterator = list.iterator();
        System.out.println("Các phần tử trong list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
    }
}
