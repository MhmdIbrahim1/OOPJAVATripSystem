
//This is the super class that will be inherited for both the Passenger and Driver classes
public class Person {
    protected  String name; // Attribute name
    protected String id;// Attribute id
    protected int age; // Attribute age
    protected String phoneNumber; // Attribute phoneNUmber

    // zero Arg Constructor
    public Person() {
    }

    //Multi Arg Constructor
    public Person(String name, String id, int age, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // getName method
    public String getName() {
        return name;
    }
    //set Name Method
    public void setName(String name) {
        this.name = name;
    }

    // get Id method
    public String getId() {
        return id;
    }

    //Set id method
    public void setId(String id) {
        this.id = id;
    }

    // get Age  method
    public int getAge() {
        return age;
    }

    // set age method
    public void setAge(int age) {
        this.age = age;
    }

    // get phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // sett phone Number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    // to string
    @Override
    public String toString() {
        return  "Person:  =>  ID: " + getId() +  "  Name: " + getName() +"Age: " + getAge()+ "\n"
                   + " Phone Number: " + getPhoneNumber();
    }
}
