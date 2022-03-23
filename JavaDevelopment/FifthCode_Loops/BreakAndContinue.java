public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2!=0){
                continue;//skips only current condition
            }
            System.out.println("Print i = "+i);
        }

        for(int i=0;i<10;i++){
            if(i%2!=0){
                break; //exit completly
            }
            System.out.println("Print i = "+i);
        }
    }
}
