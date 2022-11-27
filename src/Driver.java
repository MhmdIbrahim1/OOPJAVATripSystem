// child class inherit from person class
public class Driver extends Person{
    protected String gender; // attribute gender

    protected boolean married; // attribute married


    // zero arg-constructor
    public Driver() {
    }

    // 2-ARG-Constructor
    public Driver(String gender) {
        this.gender = gender;
    }

    // multi arg constructor And I Invoked the super contractor from parent
    public Driver(String name, String id, int age, String phoneNumber, String gender) {
        super(name, id, age, phoneNumber);
        this.gender = gender;
    }

    // setter and getter for all attributes
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    // toString method to print all Driver information
    @Override
    public String toString() {

        return "Driver:  =>  ID: " + getId() +  "  Name: " + getName() +"  Age: " + getAge()+ "\n"
            +  " Gender " + getGender()   + " Phone Number: " + getPhoneNumber() + " Is Married: ? "
            + isMarried()+"\n";
    }
}
