import java.util.Scanner;
import java.time.LocalDate;

public class OnlineBusReservationSystem {
    public static void main(String[] args) {
        char r;
        Bus bus = new Bus();

        do {
            System.out.println("********************(Online Bus Reservation System)*******************");
            System.out.println(" 1. Add Bus Details");
            System.out.println(" 2. Reserve Seat");
            System.out.println(" 3. Cancel Reservation");
            System.out.println(" 4. Available Seats");
            System.out.println(" 5. To print complete reservation details");
            System.out.println(" 6. Exit");
            System.out.println("*********************************************************************");
            Scanner obj3 = new Scanner(System.in);
            System.out.print("Enter any number :");
            int a = obj3.nextInt();
            switch (a) {
                case 1:
                    bus.addBusDetails();
                    break;

                case 2:
                    bus.reservSeat();
                    break;

                case 3:
                    bus.cancelReservation();
                    break;

                case 4:
                    bus.availableSeats();
                    break;

                case 5:
                    bus.details();
                    break;

                case 6:
                    bus.exit();
                    break;

                default:
                    System.out.println("Invalid Number!");
            }
            System.out.print("Do you want to select the next option? (Y/N): ");
            r = obj3.next().charAt(0);
        } while (r == 'y' || r == 'Y');

        if (r == 'n' || r == 'N') {
            bus.exit();
        }
    }
}

class Bus {
    String str, b, date;
    int a, c;

    void addBusDetails() {
        System.out.println("Enter Bus Name, Ticket Price, and Bus_no. : ");
        Scanner obj1 = new Scanner(System.in);
        str = obj1.nextLine();
        float price = obj1.nextFloat();
        obj1.nextLine();
        a = obj1.nextInt();
        System.out.println("Your details are: " + str + ", " + price + ", " + a);
    }

    void reservSeat() {
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Bus Name: ");
        str = obj2.nextLine();
        System.out.print("Bus_no: ");
        a = obj2.nextInt();
        obj2.nextLine();
        System.out.print("Reservation date (yyyy-mm-dd): ");
        b = obj2.nextLine();
        System.out.print("Total number of seats reserved: ");
        c = obj2.nextInt();
        obj2.nextLine();
        // Additional logic to handle reservation date and cancellation date
    }

    void cancelReservation() {
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Bus Name: ");
        str = obj2.nextLine();
        System.out.print("Bus_no: ");
        a = obj2.nextInt();
        obj2.nextLine();
        System.out.print("Reservation date (yyyy-mm-dd): ");
        b = obj2.nextLine();
        System.out.print("Total number of seats reserved: ");
        c = obj2.nextInt();
        obj2.nextLine();
        System.out.print("Cancellation date (yyyy-mm-dd): ");
        date = obj2.nextLine();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Parse the reservation date and cancellation date as LocalDate objects
        LocalDate reservationDate = LocalDate.parse(b);
        LocalDate cancellationDate = LocalDate.parse(date);

        // Compare the current date with the reservation date to check if the cancellation is valid
        if (currentDate.isBefore(reservationDate) || currentDate.isEqual(reservationDate)) {
            System.out.println("Your reservation has been cancelled!");
        } else {
            System.out.println("Cancellation is not allowed for past reservations.");
        }
    }

    int bus_no() {
        return a;
    }

    void availableSeats() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Bus_no: ");
        int busNo = input.nextInt();

        if (a == busNo) {
            int availableSeats = c - canceledSeats(); // Subtract canceled seats from the total reserved seats
            System.out.println("Total no. of available seats are: " + availableSeats);
            System.out.println("Bus Name: " + str);
            System.out.println("Bus no: " + a);
            System.out.println("Total number of available seats: " + availableSeats);
        } else {
            System.out.println("Wrong Bus_no, Please enter the correct Bus_no!");
        }
    }

    // Helper method to calculate the total number of canceled seats for the selected bus
    int canceledSeats() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Bus_no to check canceled seats: ");
        int busNo = input.nextInt();

        if (a == busNo) {
            System.out.print("Enter the number of canceled seats: ");
            int canceledSeats = input.nextInt();
            return canceledSeats;
        } else {
            System.out.println("Wrong Bus_no, Please enter the correct Bus_no!");
            return 0;
        }
    }

    void details() {
        System.out.println("Total details:");
        System.out.println("Bus Name: " + str);
        System.out.println("Bus_no: " + a);
        System.out.println("Reservation date: " + b);
        System.out.println("Total number of seats reserved: " + c);
        System.out.println("Cancellation Date: " + date);
    }

    void exit() {
        System.out.println("Exiting the program...");
        System.exit(0);
    }
}