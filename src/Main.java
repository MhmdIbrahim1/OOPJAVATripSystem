import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Driver d;
        Passenger passenger = new Passenger();
        Trip trip1 = new Trip();

        while (true) {
            try {
                System.out.println("1- Offer a new trip");
                System.out.println("2- Add a passenger to a specific trip");
                System.out.println("3- Remove a passenger from a specific trip");
                System.out.println("4- Retrieve the average number of passengers per trip of a specified date");
                System.out.println("5- Display all available trips");
                System.out.println("6- Save all the data into a text file");
                System.out.println("7- Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter number of trips");
                        int tripsNumber = scanner.nextInt();
                        scanner.nextLine();  // Consume newline left-over
                        d = new Driver();
                        System.out.println("add driver for the trip.....");
                        System.out.println();
                        System.out.println("Enter Driver ID");
                        d.setId(scanner.nextLine());
                        System.out.println("Add Driver Name");
                        d.setName(scanner.nextLine());
                        System.out.println("Add driver age");
                        d.setAge(scanner.nextInt());
                        scanner.nextLine();  // Consume newline left-over;
                        System.out.println("Add driver phoneNumber");
                        d.setPhoneNumber(scanner.nextLine());
                        System.out.println("Add driver Gender");
                        d.setGender(scanner.nextLine());
                        System.out.println("Is Marred (true or false)");
                        d.setMarried(scanner.nextBoolean());
                        for (int i = 0; i < tripsNumber; i++) {
                            trip1 = new Trip();
                            trip1.getDate();
                            System.out.println("Enter Trip ID");
                            trip1.setTripNumber(scanner.nextInt());
                            System.out.println("Enter Trip Maximum Passenger");
                            scanner.nextLine();  // Consume newline left-over
                            trip1.setMAXIMUM_NUMBER_OF_PASSENGER(scanner.nextInt());
                            scanner.nextLine();  // Consume newline left-over
                            System.out.println("Enter start time of trip");
                            trip1.setStartTime(scanner.nextLine());
                            System.out.println("Enter end time of trip");
                            trip1.setEndTime(scanner.nextLine());
                            System.out.println("Enter trip destination");
                            trip1.setDestination(scanner.nextLine());
                        }
                        TripsMethodsSystem.addNewTrip((trip1));
                        TripsMethodsSystem.addDriverToTrip(trip1, d);

                        break;

                    case 2:
                        System.out.println("Enter number of passenger you need to add");
                        int numberOfAdding = scanner.nextInt();
                        scanner.nextLine();  // Consume newline left-over
                        for (int i = 0; i < numberOfAdding; i++) {
                            passenger = new Passenger();
                            System.out.println("Adding passenger to the trip...");
                            scanner.nextLine();  // Consume newline left-over
                            System.out.println("Enter Passenger ID");
                            passenger.setId(scanner.nextLine());
                            System.out.println("Add Passenger Name");
                            passenger.setName(scanner.nextLine());
                            System.out.println("Add Passenger age");
                            passenger.setAge(scanner.nextInt());
                            scanner.nextLine();  // Consume newline left-over
                            System.out.println("Add Passenger phoneNumber");
                            passenger.setPhoneNumber(scanner.nextLine());
                            System.out.println("Enter Passenger Addresses");
                            passenger.setAddress(scanner.nextLine());
                            System.out.println("having ticket? (true or false)");
                            passenger.setTicket(scanner.nextBoolean());
                            TripsMethodsSystem.addNewPassengerInTrip(trip1, passenger);

                        }

                        break;

                    case 3:
                        TripsMethodsSystem.removePassengerFromTrip(trip1, passenger);
                        break;

                    case 4:
                        TripsMethodsSystem.averageOfPassengers(trip1);
                        break;

                    case 5:
                        TripsMethodsSystem.displayTrips();
                        break;

                    case 6:
                        TripsMethodsSystem.saveData(trip1);
                        break;

                    case 7:
                        TripsMethodsSystem.exitFromSystem();
                        return;

                }

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Enter valid inputs");
                scanner.nextLine();
            }

        }
    }
}