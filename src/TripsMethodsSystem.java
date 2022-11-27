import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class TripsMethodsSystem  {

    public static ArrayList<Trip> trips = new ArrayList<>();


    public static void addNewTrip(Trip trip1) {
        trips.add(trip1);
        System.out.println("add trip successfully");
    }


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
    public  static void addDriverToTrip(Trip inTrip , Driver newDriver){
        inTrip.getDriverList().add(newDriver);
        System.out.println("added driver successfully");
    }

    public static void removePassengerFromTrip(Trip outTrip, Passenger removePassenger) {

        if (isTripFound(outTrip)) {
            if (isPassengerIsAlreadyFound(outTrip,  removePassenger)) {
                outTrip.getPassengerList().removeIf(passenger ->passenger.getId().equals(removePassenger.getId()));
                System.out.println("passenger is deleted");
            } else {
                System.out.println("Passenger is not on the trip");
            }
        } else {
            System.out.println("The trip is not found");
        }
    }


    public static void averageOfPassengers(Trip t) {
        System.out.println("The average number of passengers per trip on "
                + t.getPassengerList().size()
                / (double) t.getMAXIMUM_NUMBER_OF_PASSENGER() * 100);

    }

    public static boolean isTripFound(Trip trip1) {
        boolean isTripFound = false;
        for (Trip t : trips
        ) {
            if (trip1.equals(t)) {
                isTripFound = true;
                break;
            }
        }
        return isTripFound;
    }

    public static boolean isMaxPassengerInTrip(Trip trip2) {

        return trip2.getPassengerList().size() < trip2.getMAXIMUM_NUMBER_OF_PASSENGER();
    }

    public static boolean isPassengerIsAlreadyFound(Trip trip3, Passenger passenger) {
        boolean passengerIsAlreadyInTrip = false;
        for (Passenger search : trip3.getPassengerList()
        ) {
            if (search.getId().equals(passenger.getId())){
                passengerIsAlreadyInTrip = true;
                break;
            }
        }
        return passengerIsAlreadyInTrip;
    }
    public static ArrayList<Trip> displayTrips() {
        Collections.sort(trips);
        for (Trip trip : trips) {
            System.out.println(trip);
        }
        return trips;
    }

    public static void saveData(Trip trip) {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            StringBuilder content = new StringBuilder();
            for (Trip trip0 : trips) {
                content.append(trip0.toString()).append("\n");
            }

            fileWriter = new FileWriter("data.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content.toString());

            System.out.println("Done");

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

    public static void exitFromSystem() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}