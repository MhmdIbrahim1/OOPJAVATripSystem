// child class inherit from person class
public class Passenger extends Person {

    protected boolean ticket; // attribute ticket
    protected String  address;  // attribute address


    // zero arg-constructor
    public Passenger() {
    }

    // 2-ARG-Constructor
    public Passenger(boolean ticket, String address) {
        this.ticket = ticket;
        this.address = address;
    }

    // multi arg constructor And I Invoked the super contractor from parent
    public Passenger(String name, String id, int age, String phoneNumber, boolean ticket, String address) {
        super(name, id, age, phoneNumber);
        this.ticket = ticket;
        this.address = address;
    }


    //setter and getter
    public Passenger(boolean ticket) {
        this.ticket = ticket;
    }

    public boolean isTicket() {
        return ticket;
    }

    public void setTicket(boolean ticket) {
        this.ticket = ticket;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // Equals method To compare between the current ID and new ID
    @Override
    public boolean equals(Object obj) {
        Passenger p1 = (Passenger) obj;
        if (getClass() != obj.getClass())
            return false;

        return this.getId().equals(p1.getId());
    }

    // toString method to print all passenger information
    @Override
    public String toString() {

        return " Passenger: => ID: " + getId() + "  Name: " + getName() + " Age: " + getAge() +
                " Address " + getAddress() + "\n" + " Phone Number: " + getPhoneNumber() + " Ticket: " + isTicket()
               + "\n";
    }
}