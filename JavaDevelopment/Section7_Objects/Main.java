import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts= {"tyres","keys"};
        //create array of three cars
        Car[] cars = new Car[]{
            new Car("Nissan",2020.00, 2021,"Red",parts),
            new Car("New Nissan",2020.00, 2021,"Purple",parts),
            new Car("Dodge",2020.00, 2010,"Red",parts),
            new Car("Honda",2020.00, 2018,"White",parts),
            new Car("Hyundai",2020.00, 2019,"Green",parts)
        };
        Car nissan = new Car("Nissan",2020.00, 2021,"Red",parts);
        nissan.setColor("Black");

        double newPrice = nissan.getPrice();
        newPrice= newPrice/2;
        nissan.setPrice(newPrice);
        nissan.drive();

        System.out.println(Arrays.toString(nissan.getParts()));
       
        Car nissan2 = new Car(nissan);
        nissan2.drive();
        nissan2.setParts(new String[] {"tires", "filter","Mirror"});
        System.out.println(Arrays.toString(nissan2.getParts()));

        Car dodge = new Car("Dodge",2020.00, 2022,"Red",parts);
        dodge.setColor("Black");
       dodge.drive();

       Person[] people = {new Person("Gaurav", 30),
       new Person("Neha", 28),
       new Person("Dings", 32)};

        Person per = new Person("Gaurav", 30);
       per.setName("Neha");
        per.setAge(29);
        System.out.println(per.getName()+"        "+per.getAge());

        Person per1 = new Person(per);
        per1.setName("Dingu");
        per1.setAge(32);
        System.out.println(per1.getName()+"        "+per1.getAge());

        //create dealership object and add data to cars
       Dealership deal = new Dealership(cars);
      /*   for (int i = 0; i < cars.length; i++) {
            deal.setCar(cars[i], i);
        }*/

        Car newCar = deal.getCar(0);
        newCar.setColor("blue");//Avoided reference trap hence it does not change inside variable now
        System.out.println("Get Car details : \n"+newCar);
        System.out.println(deal.getCar(0));//its color remains red

        //sell car
        deal.sell(2);
        System.out.println("Car sold :\t "+cars[2]);

        //Serach car
        String make = scan.nextLine();
        int budget = scan.nextInt();
        int index = deal.search(make, budget);

        switch(index){
            case 404:
            System.out.println("Feel free to browse our collection");
            System.out.println(deal);
            break;

            default:
            scan.nextLine();
            String decision = scan.nextLine();
            if(decision.equals("yes")){
                deal.sell(index);
            }
        }
        scan.close();

        //SysOut dealership object to test toString()
        System.out.println(deal);

        //Airline and Person code
        Airline airline = new Airline();
        for(int i=0; i<people.length;i++){
            airline.setPerson(people[i], i);
        }

       System.out.println( airline.getPerson(0));

       Person newPer = airline.getPerson(0);
       newPer.setName("Mints");
       System.out.println( airline.getPerson(0));
    }
}