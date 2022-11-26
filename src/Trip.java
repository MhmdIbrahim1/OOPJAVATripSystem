import java.util.ArrayList;
import java.util.Date;

public class Trip implements Comparable<Trip> {

    protected Integer tripNumber;
    protected Driver driver;
    Passenger passenger;
    protected static Date date = new Date();

     int MAXIMUM_NUMBER_OF_PASSENGER;

    protected String startTime;
    protected String endTime;
    protected String destination;

    ArrayList<Passenger> passengerList = new ArrayList<>();
    ArrayList<Driver> driverList = new ArrayList<>();

    public Trip() {
    }

    public Trip(Integer tripNumber, Driver driver, Date date, String startTime, String endTime, String destination, Passenger p) {
        this.tripNumber = tripNumber;
        this.driver = driver;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.destination = destination;
        this.passenger = p;
    }

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

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }
    public ArrayList<Driver> getDriverList() {
        return driverList;
    }


    @Override
    public String toString() {

        return "Date = " + date + "  { TripNo =  "+ tripNumber + "--" +  " Start time:   " + getStartTime() +
                "  End time:  " + getEndTime() + " destination  " + destination + "\n"+
                " Driver = " + getDriverList()+ "  " + "---" + "\n" +
                " MAXIMUM NUMBER OF PASSENGER =  " + getMAXIMUM_NUMBER_OF_PASSENGER()+ "  "+
                "\n"+ " " + getPassengerList() +"\n";
    }

    @Override
    public boolean equals(Object obj) {
        Trip t1 = (Trip) obj;
        if (getClass() != obj.getClass())
            return false;

        return this.getTripNumber().equals(t1.getTripNumber());

    }

    @Override
    public int compareTo(Trip sorting) {
        return this.getTripNumber().compareTo(sorting.tripNumber);
    }
}
