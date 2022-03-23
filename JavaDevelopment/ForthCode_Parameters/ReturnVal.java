public class ReturnVal {
    public static void main(String[] args) {
        System.out.println(measureRect(1.1, 2,"area"));
        System.out.println(measureRect(-1.1, 2,"perimeter"));
    }
    public static double measureRect(double len, double width,String option){
        if(len<0 || width<0){
            System.out.println("Invalid Length and Width");
            System.exit(0);
        }
            switch(option){
                case "area":  return len *width;
                case "perimeter":  return 2 * (len + width);
                default : return 404;
            }
    }
}
