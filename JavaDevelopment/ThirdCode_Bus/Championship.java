public class Championship {
    public static void main(String[] args) {
        int gryf= 400;
        int raven = 200;
        if(gryf-raven>=300){
            System.out.println("Yeah!! First.");
        }
        else if(gryf>raven){
            System.out.println("Second");
        }
        else if(raven-gryf<=100){
            System.out.println("Third");
        }
        else if(raven-gryf>100){
            System.out.println("Forth");
        }
    }
}
