import java.util.ArrayList;

public class App21 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Brown");

        System.out.println(colors.get(1));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
