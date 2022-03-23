import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy","Jim", "Ellie"};
        String[] staffThisYear = staffLastYear;
        staffThisYear[2]= "Abby";//it changes value in last year as weel which is not correct. So never refer arrays.
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

        //better copy array
        String[] staffThisYearNew = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYearNew[2]= "Joe";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYearNew));
    }
}
