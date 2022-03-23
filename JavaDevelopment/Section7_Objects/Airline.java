public class Airline {
    private Person[] people;

    public Airline(){
        this.people = new Person[11];
    }

    public Person getPerson(int index){
        return new Person(this.people[index]);
    }

    public void setPerson(Person people, int index){
        this.people[index]=new Person(people); 
    }
}
