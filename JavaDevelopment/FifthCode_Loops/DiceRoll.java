public class DiceRoll {
    public static void main(String[] args) {
        int diceData = diceRoll();
        int points= 0;
        while(diceData!=0){
            diceData = diceRoll();
            System.out.println(diceData);
            if(diceData==6){
                break;
            }
            else if(diceData==4){
                continue;
            }
            else{
                points++;
            }
            if(points==3){
                System.out.println("You won!!!");
                break;
            }
        }
    }

    public static int diceRoll(){
        return (int)((Math.random()*6)+1);
    }
}
