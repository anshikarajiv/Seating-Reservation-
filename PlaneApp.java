package seat1;
import java.util.*;
public class PlaneApp {

		public static void main(String[] args) {
		     
		        int choice;
		       // PlaneSeat s1 = new PlaneSeat(10);
		       // s2 = new PlaneSeat(12);
		      //  PlaneSeat s3 = new PlaneSeat(8);


		        Plane plane = new Plane();
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Expected outputs:\n" +
		                "(1) Show number of empty seats\n" +
		                "(2) Show the list of empty seats\n" +
		                "(3) Show the list of seat assignments by seat ID\n" +
		                "(4) Show the list of seat assignments by customer ID\n" +
		                "(5) Assign a customer to a seat\n" +
		                "(6) Remove a seat assignment\n" +
		                "(7) Exit\n");


		        do{


		            System.out.println("Enter number of your choice: ");
		            choice = sc.nextInt();


		            switch (choice) {
		                case 5:
		                    int seatId, cust_id;
		                    System.out.println("Assigning Seat....");
		                    System.out.println("Please enter seatID: ");
		                    seatId = sc.nextInt();
		                    System.out.println("Please enter customer id: ");
		                    cust_id = sc.nextInt();
		                    plane.assignSeat(seatId, cust_id);
		                    System.out.println("Seat has been assigned");
		                    break;

		                case 1:
		                    System.out.print("There are ");
		                    plane.showNumEmptySeats();
		                    System.out.print("empty seats\n");
		                    break;
		                case 2:
		                    plane.showEmptySeats();
		                    break;
		                case 3:
		                    plane.showAssignedSeats(true);
		                    System.out.print("\n");
		                    break;
		                case 4:
		                    plane.showAssignedSeats(false);
		                    System.out.print("\n");
		                    break;

		                case 6:
		                    int rem_seat;
		                    System.out.println("Enter the seat u want to remove: ");
		                    rem_seat = sc.nextInt();
		                    plane.unAssignSeat(rem_seat);
		                    break;

		            }
		        } while(choice != 7);
		    }
		}


