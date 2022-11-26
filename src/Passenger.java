public class Passenger extends Person {

    protected boolean ticket;
    protected String  address;

    public Passenger() {
    }

    public Passenger(boolean ticket, String address) {
        this.ticket = ticket;
        this.address = address;
    }

    public Passenger(String name, String id, int age, String phoneNumber, boolean ticket, String address) {
        super(name, id, age, phoneNumber);
        this.ticket = ticket;
        this.address = address;
    }

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

    @Override
    public boolean equals(Object obj) {
        Passenger p1 = (Passenger) obj;
        if (getClass() != obj.getClass())
            return false;

        return this.getId().equals(p1.getId());
    }

    @Override
    public String toString() {

        return " Passenger: => ID: " + getId() + "  Name: " + getName() + " Age: " + getAge() +
                " Address " + getAddress() + "\n" + " Phone Number: " + getPhoneNumber() + " Ticket: " + isTicket()
               + "\n";
    }
}