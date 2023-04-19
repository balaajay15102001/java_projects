import java.util.*;
public class ticket {
    Scanner input = new Scanner(System.in);
    public void main(String[] args) {
        int choice;
        System.out.println("*********WELCOME TO TICKET BOOKING SYSTEM**********");
        System.out.println("Choose your choices you want");
        System.out.println("1.Booking");
        System.out.println("2.Listing");

        do {
            System.out.println("Enter your Choice: ");
            choice = this.input.nextInt();
            switch (choice) {
                case 1:
                    booking();break;
                case 2:listing();break;
                default:
                    System.out.println("Thanking for attending the booking Ticket..");
                    break;

            }
            //int repeat = input.nextInt();
        } while (choice<4);
    }

    public void booking() {
        System.out.println("******Welcome you choose booking********");
        System.out.println("Select the departure:");
        String departure = this.input.next();
        System.out.println("Select the Destination:");
        String destination = this.input.next();
        if (departure=="Madurai" && destination == "Trichy"){
            System.out.println("No:123 Madurai to Trichy time:21:00");
            System.out.println("Enter the number of seat you want:");
            int seat = this.input.nextInt();
            System.out.println("Enter your Mobile Number:");
            long phone_no=this.input.nextLong();
            System.out.println("Thank you we will confirm your tickets and message to your phone....:)");
        } else if (departure=="Coimbatore" && destination == "Madurai") {
            System.out.println("No:124 Coimbatore to Madurai time:9:00");
            System.out.println("Enter the number of seat you want:");
            int seat = this.input.nextInt();
            System.out.println("Enter your Mobile Number:");
            long phone_no=this.input.nextLong();
            System.out.println("Thank you we will confirm your tickets and message to your phone....:)");
        }
        else if (departure=="Trichy" && destination == "Coimbatore") {
            System.out.println("No:126 Trichy to Coimbatore time:9:00");
            System.out.println("Enter the number of seat you want:");
            int seat = this.input.nextInt();
            System.out.println("Enter your Mobile Number:");
            long phone_no=this.input.nextLong();
            System.out.println("Thank you we will confirm your tickets and message to your phone....:)");
            seat(seat);
        }

    }
    public static void listing(){
        System.out.println("1.Madurai to Trichy");
        System.out.println("2.Coimbatore to Madurai");
        System.out.println("3.Trichy to Coimbatore");
    }
    public static void seat(int seat){
        int max =100;
        if (max>seat){
            System.out.println("Your ticket can be confirmed!!..");
        }

    }


}

