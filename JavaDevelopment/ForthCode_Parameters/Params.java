public class Params {
    public static void main(String[] args) {
        measureRect(10.1, 11);
    }

    public static void measureRect(double length, double width){
        double area = length * width;
        System.out.println("The area of Rectangle is : "+ area);
    }
}
