import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
// TripsMethodsSystem That have all required system methods
public class TripsMethodsSystem {

    // Trips ArrayList will have trip Information
    public static ArrayList<Trip> trips = new ArrayList<>();


    // method that add new trip inside trips arrayList
    public static void addNewTrip(Trip trip1) {
        trips.add(trip1);
        System.out.println("add trip successfully");
    }


    // method that add new Passenger inside specific trip
    public static void addNewPassengerInTrip(Trip inTrip, Passenger newPassenger) {
        if (isTripFound(inTrip)) {
            if (isMaxPassengerInTrip(inTrip)) {
                if (isPassengerIsAlreadyFound(inTrip, newPassenger)) {
                    System.out.println("sorry, Passenger Already in the trip");
                } else {
                    inTrip.getPassengerList().add(newPassenger);
                    System.out.println("added passenger successfully");
                }
            } else {
                System.out.println("Trip is fully");
            }
        } else {
            System.out.println("Cant find the trip");
        }
    }

    // method that add new Driver inside specific trip
    public static void addDriverToTrip(Trip inTrip, Driver newDriver) {
        inTrip.getDriverList().add(newDriver);
        System.out.println("added driver successfully");
    }

    // method that remove  Passenger from specific trip
    public static void removePassengerFromTrip(Trip outTrip, Passenger removePassenger) {

        if (isTripFound(outTrip)) {
            if (isPassengerIsAlreadyFound(outTrip, removePassenger)) {
                outTrip.getPassengerList().removeIf(passenger -> passenger.getId().equals(removePassenger.getId()));
                System.out.println("passenger is deleted");
            } else {
                System.out.println("Passenger is not on the trip");
            }
        } else {
            System.out.println("The trip is not found");
        }
    }

    // method that calculate the average of passenger per trio
    public static void averageOfPassengers(Trip t) {
        System.out.println("The average number of passengers per trip on "
                + t.getPassengerList().size()
                / (double) t.getMAXIMUM_NUMBER_OF_PASSENGER() * 100);

    }

    // Method checks if a trip already exists before adding a passenger to it
    public static boolean isTripFound(Trip trip1) {
        boolean isTripFound = false; //  flag variable
        for (Trip t : trips
        ) {
            if (trip1.equals(t)) {
                isTripFound = true;
                break;
            }
        }
        return isTripFound;
    }

    //Method checks if the trip is full or not before adding a passenger to it
    public static boolean isMaxPassengerInTrip(Trip trip2) {

        return trip2.getPassengerList().size() < trip2.getMAXIMUM_NUMBER_OF_PASSENGER();
    }

    //Method checks if there is a passenger with the same ID present on a particular flight
    public static boolean isPassengerIsAlreadyFound(Trip trip3, Passenger passenger) {
        boolean passengerIsAlreadyInTrip = false;
        for (Passenger search : trip3.getPassengerList()
        ) {
            if (search.getId().equals(passenger.getId())) {
                passengerIsAlreadyInTrip = true;
                break;
            }
        }
        return passengerIsAlreadyInTrip;
    }

    //Method prints all trip information
    public static ArrayList<Trip> displayTrips() {
        // sort the Information by Trip number
        Collections.sort(trips);
        // check if the trip is empty first
        if (trips.isEmpty()) {
            System.out.println("Cant find any trips");
        } else {
            // printing all trips information
            for (Trip trip : trips) {
                System.out.println(trip);
            }
        }
        return trips;
    }

    public static boolean isPhoneNumber(String phoneNumber){
        if(phoneNumber.length() != 11){
            System.out.println("Phone number must be 11 digits.please Enter Valid Phone number");
            return false;

        } else {
            return true;
        }
    }
    //A method that saves all trip information into a file
    public static void saveDataToFile(Trip trip) {

        BufferedWriter bufferedWriter = null; // create bufferedWriter
        FileWriter fileWriter = null;// create fileWriter

        try {
            StringBuilder content = new StringBuilder(); // create string builder
            // loop through the trips arrayList to adding all data into file
            for (Trip trip0 : trips) {
                content.append(trip0.toString()).append("\n");
            }
            fileWriter = new FileWriter("AllTripData.txt"); // create file named "data"
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content.toString()); // write all data into file
            System.out.println("Write data into file successfully");

            // some catching of any exception might happen
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();

                if (fileWriter != null)
                    fileWriter.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }


    // method that exit from Input system
    public static void exitFromSystem() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}

// end