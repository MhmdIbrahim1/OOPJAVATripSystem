import java.util.ArrayList;
import java.util.Date;
// Trip class that have all trip Information , implement Comparable,
// to use the compareTo method
public class Trip implements Comparable<Trip> {

    protected Integer tripNumber; // Attribute tripNumber
    protected Driver driver; // Attribute Driver
    Passenger passenger; // Attribute passenger
    protected static Date date = new Date(); // Attribute Date that take the current Date

     int MAXIMUM_NUMBER_OF_PASSENGER; //Attribute MAXIMUM_NUMBER_OF_PASSENGER

    protected String startTime; // Attribute start time
    protected String endTime; // Attribute end time
    protected String destination; // Attribute destination

    //ArrayList takes Passenger information
    ArrayList<Passenger> passengerList = new ArrayList<>();

    //ArrayList takes Passenger information
    ArrayList<Driver> driverList = new ArrayList<>();

    // zero arg-constructor
    public Trip() {
    }

    // multi arg constructor
    public Trip(Integer tripNumber, Driver driver, Date date, String startTime
            , String endTime, String destination, Passenger p) {
        this.tripNumber = tripNumber;
        this.driver = driver;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.destination = destination;
        this.passenger = p;
    }

    // getter and setter for all attributes
    public Integer getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(Integer tripNumber) {
        this.tripNumber = tripNumber;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMAXIMUM_NUMBER_OF_PASSENGER() {
        return MAXIMUM_NUMBER_OF_PASSENGER;
    }
    public void setMAXIMUM_NUMBER_OF_PASSENGER(int MAXIMUM_NUMBER_OF_PASSENGER) {
        this.MAXIMUM_NUMBER_OF_PASSENGER =  MAXIMUM_NUMBER_OF_PASSENGER;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    // getter of arrayList of type passenger it will have all passenger information
    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    // getter of arrayList of type passenger it will have all Driver information
    public ArrayList<Driver> getDriverList() {
        return driverList;
    }


    // Equals method To compare between the current trip number and new trip number
    @Override
    public boolean equals(Object obj) {
        Trip t1 = (Trip) obj;
        if (getClass() != obj.getClass())
            return false;

        return this.getTripNumber().equals(t1.getTripNumber());

    }


    // compareTo method that Sort the all information in ascending order
    @Override
    public int compareTo(Trip sorting) {
        return this.getTripNumber().compareTo(sorting.tripNumber);
    }

    // toString method to print all Trip information
    @Override
    public String toString() {

        return "Date = " + date + "  { TripNo =  "+ tripNumber + "--" +  " Start time:   " + getStartTime() +
                "  End time:  " + getEndTime() + " destination  " + destination + "\n"+
                " Driver = " + getDriverList()+ "  " + "---" + "\n" +
                " MAXIMUM NUMBER OF PASSENGER =  " + getMAXIMUM_NUMBER_OF_PASSENGER()+ "  "+
                "\n"+ " " + getPassengerList() +"\n";
    }
}
