public class DocComments {
    public static void main(String[] args) {
        greet();
        printText("Gaurav", "31");
    }

    /**
     *  Function Name- Greet
     *  Inside the function- 
     *  1. Print Hi
     * Params
     */
    public static void greet(){
        System.out.println("Hi");
    }

    /**
     * Function- printText
     * @param name
     * @param age
     * 
     * Inside the function-
     * 1. Print name and age
     */
    public static void printText(String name, String age){
        System.out.println("Hi "+name+" "+age);
    }
}
