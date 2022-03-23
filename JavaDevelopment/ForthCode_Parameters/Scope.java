public class Scope {
    static int  orange;
    public static void main(String[] args) {      
        orange =2; 
        someFun();
    }

    public static void someFun(){
        int apple=5;
        orange = 4;
        System.out.println(apple);
    }
}
