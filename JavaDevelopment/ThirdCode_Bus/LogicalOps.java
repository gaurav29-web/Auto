public class LogicalOps {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
     //   if(chemistryGrade>75 || englishGrade >75){
        if(chemistryGrade>75 && englishGrade >75){
            System.out.println("You got scholarship!");
        }
        else System.out.println("We are sorry, you did not receive scholarship");
    }
}
