import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Jim");
        names.add("Katie");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.set(0, "Joe Fresh");
        System.out.println(names.get(0));

        names.add(3,"Joe");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.remove(0);

        names.clear();

        System.out.println(names.size());
    }
}
