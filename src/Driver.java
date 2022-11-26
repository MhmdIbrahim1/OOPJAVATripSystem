public class Driver extends Person{
    protected String gender;

    protected boolean married;


    public Driver() {
    }

    public Driver(String gender) {
        this.gender = gender;
    }

    public Driver(String name, String id, int age, String phoneNumber, String gender) {
        super(name, id, age, phoneNumber);
        this.gender = gender;
    }

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

    @Override
    public String toString() {

        return "Driver:  =>  ID: " + getId() +  "  Name: " + getName() +"  Age: " + getAge()+ "\n"
            +  " Gender " + getGender()   + " Phone Number: " + getPhoneNumber() + "\n";
    }
}
