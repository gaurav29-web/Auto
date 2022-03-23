import java.util.HashMap;

public class KeyValues {
  
    public static void main(String[] args) {
        String[] vegetables = new String[] {"Cauliflower", "Spaghetti Squash", "Parsley"};
        double[] prices = new double[] {4.99, 1.99, 6.99};

        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Cauliflower", 4.99);
        hm.put("Spaghetti Squash", 1.99);
        hm.put("Parsley", 6.99);

        hm.put("Parsley", 12.22);
        System.out.println(hm.get("Cauliflower"));

        hm.forEach((key,value) -> {
            System.out.println(key + " : "+value);
        });
    }
  
}
