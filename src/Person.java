public class Person {
    protected  String name;
    protected String id;
    protected int age;
    protected String phoneNumber;

    public Person() {
    }

    public Person(String name, String id, int age, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  "Person:  =>  ID: " + getId() +  "  Name: " + getName() +"Age: " + getAge()+ "\n"
                   + " Phone Number: " + getPhoneNumber();
    }
}
