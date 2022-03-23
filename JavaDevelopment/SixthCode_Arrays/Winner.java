public class Winner {
    public static void main(String[] args) {
        int[] marks = {33,11,2,5,100};
        int temp=0;
        for(int i=0;i<marks.length-1;i++){
            if(marks[i]>marks[i+1])  {
                temp = marks[i];
                marks[i]= marks[i+1];
                marks[i+1]=temp;
            }             
        }
        System.out.println("Congrats you got highets score of = "+ marks[marks.length-1]);
    }
}
