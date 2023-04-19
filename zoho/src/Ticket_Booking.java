import java.util.*;
public class Ticket_Booking {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        System.out.println("*********WELCOME TO BUS TICKET BOOKING SYSTEM**********");
        System.out.println("Choose your choices you want");
        System.out.println("1.Listing");
        System.out.println("2.Booking");
        System.out.println("3.Leave the Application");
        list obj1 = new list();
        book obj2 = new book();

        do {
            System.out.print("Enter your Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    obj1.listing();
                    break;
                case 2:
                    obj2.booking();
                    break;
                default:
                    System.out.println("Thanking for attending the booking Ticket..");
                    break;

            }
            //int repeat = input.nextInt();
        } while (choice < 3);
    }

}
class book{
    static Scanner input = new Scanner(System.in);
    public static void booking() {
        System.out.println("******Welcome you choose booking********");
        System.out.print("Select the departure:");
        String departure = input.next();//Enter your location
        System.out.print("Select the Destination:");
        String destination = input.next();//Enter the destination
        //By using if statement for the given travel details
        if (departure.equalsIgnoreCase("Madurai") && destination.equalsIgnoreCase("Trichy")) {
            System.out.println("No:123 Madurai to Trichy time:21:00");
            System.out.print("Enter the number of seat you want:");
            int seat = input.nextInt();
            System.out.print("Enter your Mobile Number:");
            long phone_no = input.nextLong();
            System.out.print("Thank you we will confirm your tickets and message to your phone....:)");
        }
        else if (departure.equalsIgnoreCase("Coimbatore") && destination.equalsIgnoreCase("Madurai")) {
            System.out.println("No:124 Coimbatore to Madurai time:9:00");
            System.out.print("Enter the number of seat you want:");
            int seat = input.nextInt();
            System.out.print("Enter your Mobile Number:");
            long phone_no = input.nextLong();
            System.out.print("Thank you we will confirm your tickets and message to your phone....:)");
        }
        else if (departure.equalsIgnoreCase("Trichy") && destination.equalsIgnoreCase("Coimbatore")) {
            System.out.println("No:126 Trichy to Coimbatore time:9:00");
            System.out.print("Enter the number of seat you want:");
            int seat = input.nextInt();
            System.out.print("Enter your Mobile Number:");
            long phone_no = input.nextLong();
            System.out.println("Thank you we will confirm your tickets and message to your phone....:)");
        }

    }
}
//listing the Service details
class list{
    public static void listing(){
        System.out.println("1.Madurai to Trichy");
        System.out.println("2.Coimbatore to Madurai");
        System.out.println("3.Trichy to Coimbatore");
    }
}
