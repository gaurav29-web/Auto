

public class Dealership {
    //Create array for multiple cars
        private Car[] cars;

        //set array size to initiate cars array
        public Dealership(Car[] cars){
            this.cars=new Car[cars.length];
            //set all values for Cars
            for (int i = 0; i < cars.length; i++) {
                this.cars[i]=new Car(cars[i]);
            }
        }

        //create setter as per one element in Array so that all values are not updated in go.
        //Not used while setting values in constrcutor above
        public void setCar(Car car, int index){
            this.cars[index]= new Car(car);
        }

        //create getter for array as per index. If we get all cars at a go it will take alot of memory
        public Car getCar(int index){
            return new Car(this.cars[index]);//return new copy to avoid reference trap
        }

        //Sell a car, customer drives it and after that car is set to null
        public void sell(int index){
            this.cars[index].drive();
            this.cars[index]=null;
        }

        public int search(String make, int budget){
            for(int i=0;i<this.cars.length;i++){
                if(this.cars[i]==null) continue;
                if(this.cars[i].getMake().equalsIgnoreCase(make) && (int)(this.cars[i].getPrice())<=budget){
                    System.out.println("You have option to buy : "+ cars[i].getMake());
                    return i;
                }
            }
            System.out.println("Your search did not return \n");
            return 404;
        }

        public String toString(){
            String temp="";
            for(int i=0;i<this.cars.length;i++){
                temp += "Parking Spot: "+i+"\n";
                if(this.cars[i]==null){
                    temp+= "Empty for parking spot";
                }
                else                 temp += this.cars[i].toString()+"\n";
            }                
            return temp;
        }
}
