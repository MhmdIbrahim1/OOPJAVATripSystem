import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Driver d;
        Passenger passenger = new Passenger();
        Trip trip1 = new Trip();

        // INPUT SYSTEM

        // while loop with true to keep asking the user until he presses the exit option
        while (true) {
            // try to catch any input exception from the user
            try {
                // menu of trip system
                System.out.println("----------------------------");
                System.out.println("1- Offer a new trip");
                System.out.println("----------------------------");
                System.out.println("2- Add a passenger to a specific trip");
                System.out.println("----------------------------");
                System.out.println("3- Remove a passenger from a specific trip");
                System.out.println("----------------------------");
                System.out.println("4- Retrieve the average number of passengers per trip of a specified date");
                System.out.println("----------------------------");
                System.out.println("5- Display all available trips");
                System.out.println("----------------------------");
                System.out.println("6- Save all the data into a text file");
                System.out.println("----------------------------");
                System.out.println("7- Exit");

                // store the choice from the user
                int choice =0;
                try {
                     choice = Integer.parseInt(scanner.next());
                } catch (NumberFormatException ne) {
                    System.out.println("Enter valid choice");
                }
                // switch cases the loop throw choices of menu
                switch (choice) {
                 // case one i take all driver information first before the trip
                    case 1:
                        int tripsNumber =0;
                        boolean done_0 = false;
                        while (!done_0) {
                            try {
                                System.out.println("Enter number of trips");
                                 tripsNumber = scanner.nextInt();
                                 done_0 = true;
                            }catch (InputMismatchException e_0){
                                System.out.println("Enter valid trip numbers");
                                scanner.nextLine();
                            }
                        }
                        scanner.nextLine();  // Consume newline left-over
                        d = new Driver();
                        System.out.println("add driver for the trip.....");
                        System.out.println();
                        System.out.println("Enter Driver ID");
                        d.setId(scanner.nextLine());
                        System.out.println("Add Driver Name");
                        d.setName(scanner.nextLine());
                        boolean done_1 = false; // flag variable to be break point of the loop
                        while (!done_1) { // break the infinity loop when an exception happen
                            try {
                                System.out.println("Add driver age");
                                d.setAge(scanner.nextInt());
                                done_1 = true; // break point
                            } catch (InputMismatchException e1) {
                                System.out.println("please try again and Enter valid age ");
                                scanner.nextLine(); // break the infinity loop when an exception happen
                            }
                        }
                        scanner.nextLine();  // Consume newline left-over;
                        System.out.println("Add driver phoneNumber");
                        // take phone number from the user
                        int driverPhoneNumber =scanner.nextInt();
                        // check if the user entering phone number in right way
                       boolean done_1_1 = false; // flag variable to be break point of the loop
                       while (!done_1_1) {// loop until done_1_2 be true value
                           try {
                               done_1_1 = true; // break point
                               while (!(driverPhoneNumber > 11)) {
                                   // keep asking the user unit he enters valid phone number
                                   if (TripsMethodsSystem.isValidPhoneNumber(String.valueOf(driverPhoneNumber))) {
                                       d.setPhoneNumber(String.valueOf(driverPhoneNumber));
                                   } else {
                                       driverPhoneNumber = scanner.nextInt();
                                       d.setPhoneNumber(String.valueOf(driverPhoneNumber));
                                   }

                               }
                           } catch (InputMismatchException e1_1) {
                               System.out.println("Please enter valid phone number for the driver ");
                               scanner.nextLine(); // break the infinity loop when an exception happen
                           }
                       }
                        scanner.nextLine();  // Consume newline left-over;
                        System.out.println("Add driver Gender");
                        d.setGender(scanner.nextLine());
                        boolean done_1_2 = false; // flag variable to be break point of the loop
                        while (!done_1_2) { // loop until done_1_2 be true value
                            try {
                                System.out.println("Is Marred (true or false)");
                                d.setMarried(scanner.nextBoolean());
                                done_1_2 = true; // break point
                            }catch (InputMismatchException e_1_2){
                                System.out.println("Please Enter: " + " true " + " or: " + " false " );
                                scanner.nextLine(); // break the infinity loop when an exception happen
                            }
                        }

                        // loop throw all trips information and take it from the user
                        for (int i = 0; i < tripsNumber; i++) {
                            // crete new object of trip
                            trip1 = new Trip();
                            // get the actual date that we are creating the trip
                            trip1.getDate();
                            boolean done_2 = false; // flag variable to be break point of the loop
                            while (!done_2) { // loop until done_1_2 be true value
                                try {
                                    System.out.println("Enter Trip ID");
                                    trip1.setTripNumber(scanner.nextInt());
                                    done_2 = true;// break point
                                }catch (InputMismatchException e_2){
                                    System.out.println("Enter Valid trip ID, try again!!");
                                    scanner.nextLine();// break the infinity loop when an exception happen
                                }
                            }
                            boolean done_2_1 = false; // flag variable to be break point of the loop
                            while (!done_2_1) {// loop until done_1_2 be true value
                                try {
                                    System.out.println("Enter Trip Maximum Passenger");
                                    scanner.nextLine();  // Consume newline left-over
                                    trip1.setMAXIMUM_NUMBER_OF_PASSENGER(scanner.nextInt());
                                    scanner.nextLine();  // Consume newline left-over
                                    done_2_1 = true;// break point
                                }catch (InputMismatchException e2_1){
                                    System.out.println("Enter valid Maximum Passenger for the trip!!, try again pls");
                                    scanner.nextLine(); // break the infinity loop when an exception happen
                                }
                            }
                            System.out.println("Enter start time of trip");
                            trip1.setStartTime(scanner.nextLine());
                            System.out.println("Enter end time of trip");
                            trip1.setEndTime(scanner.nextLine());
                            System.out.println("Enter trip destination");
                            trip1.setDestination(scanner.nextLine());
                        }
                        // calling the tow mecthod thad adding anew trip and new driver inside the trip
                        TripsMethodsSystem.addNewTrip((trip1));
                        TripsMethodsSystem.addDriverToTrip(trip1, d);
                        // brake case 1
                        break;

                    case 2:
                            boolean done_3_0 = false; // flag variable to be break point of the loop
                        int numberOfAddingPassengers =0;
                            while (!done_3_0) { // loop until done_3_0 be true value
                                try {
                                    System.out.println("Enter number of passenger you need to add");
                                    numberOfAddingPassengers = Integer.parseInt(scanner.next());
                                    done_3_0 =true; // break point
                                }catch (NumberFormatException e_3_0){
                                    System.out.println("Enter Valid Input!!!!");
                                    scanner.nextLine(); // break the infinity loop when an exception happen
                                }
                            }
                            // loop throw number of adding passenger
                            // then storing all passenger information
                            for (int i = 0; i < numberOfAddingPassengers; i++) {
                                passenger = new Passenger();
                                System.out.println("Adding passenger to the trip...");
                                scanner.nextLine();  // Consume newline left-over
                                System.out.println("Enter Passenger ID");
                                passenger.setId(scanner.nextLine());
                                System.out.println("Add Passenger Name");
                                passenger.setName(scanner.nextLine());
                                boolean done_3 = false; // flag variable to be break point of the loop
                                while (!done_3) { // loop until done_1_2 be true value
                                    try {
                                        System.out.println("Add Passenger age");
                                        passenger.setAge(scanner.nextInt());
                                        done_3 = true; // break point
                                    } catch (InputMismatchException e2) {
                                        System.out.println("please try again and Enter valid age");
                                        scanner.nextLine(); // break the infinity loop when an exception happen
                                    }
                                }
                                int passengerPhoneNumber = scanner.nextInt();
                                // check if the user entering valid phone number
                                while (!(passengerPhoneNumber >= 11)) {
                                    if (TripsMethodsSystem.isValidPhoneNumber(String.valueOf(passengerPhoneNumber))) {
                                        passenger.setPhoneNumber(String.valueOf(passengerPhoneNumber));
                                    } else {
                                        passengerPhoneNumber = scanner.nextInt();
                                        passenger.setPhoneNumber(String.valueOf(passengerPhoneNumber));
                                    }
                                }
                                scanner.nextLine();  // Consume newline left-over;
                                System.out.println("Enter Passenger Addresses");
                                passenger.setAddress(scanner.nextLine());
                                System.out.println("having ticket? (true or false)");
                                passenger.setTicket(scanner.nextBoolean());
                                // add all information of passenger inside the trip
                                TripsMethodsSystem.addNewPassengerInTrip(trip1, passenger);
                            }
                        // breaking case 2
                        break;

                    case 3:
                        // case 3 that remove passenger from trip
                            TripsMethodsSystem.removePassengerFromTrip(trip1, passenger);
                        break;

                    case 4:
                        // case 4 get the average of passengers per trip
                        TripsMethodsSystem.averageOfPassengers(trip1);
                        break;

                    case 5:
                        // display all trips information
                        TripsMethodsSystem.displayTrips();
                        break;

                    case 6:
                        // in this case storing the whole data inside file
                        TripsMethodsSystem.saveDataToFile(trip1);
                        break;

                    case 7:
                        // this case to break the loop
                        TripsMethodsSystem.exitFromSystem();
                        return;
                    default:
                        System.out.println("You entered Invalid input try Again or press 7 to exit");
                }


            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Enter valid inputs");
                scanner.nextLine();
            }

        }
    }

}