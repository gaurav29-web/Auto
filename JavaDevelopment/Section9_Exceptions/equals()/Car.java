public class Car {
    String make;
    String color;

    public Car(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public Car(Car source) {
        this.make = source.make;
        this.color = source.color;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object o){
        if(o ==null){
            return false;
        }
        if(!(o instanceof Car)){
            return false;
        }
        Car car = (Car)o;
        return this.make.equals(car.make) && this.color.equals(car.color);
    }

}
