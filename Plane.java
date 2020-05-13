package seat1;
import java.util.*;
public class Plane {
	private PlaneSeat[] seat;
	private PlaneSeat[] sortSeatID;
	private int numEmptySeat;


	public Plane() {
        seat = new PlaneSeat[12];
        seat[0] = new PlaneSeat(1);

        seat[1] = new PlaneSeat(2);

        seat[2] = new PlaneSeat(3);
        seat[3] = new PlaneSeat(4);
        seat[4] = new PlaneSeat(5);
        seat[5] = new PlaneSeat(6);
        seat[6] = new PlaneSeat(7);
        seat[7] = new PlaneSeat(8);
        seat[8] = new PlaneSeat(9);
        seat[9] = new PlaneSeat(10);
        seat[10] = new PlaneSeat(11);
        seat[11] = new PlaneSeat(12);
        numEmptySeat=12;
    }


	private PlaneSeat[] sortSeats() {
	PlaneSeat[] new_array = new PlaneSeat[this.seat.length];
	        for (int i = 0; i < this.seat.length; i++) {
	            new_array[i] = this.seat[i];
	        }
	        int n = new_array.length;
	        for (int i = 1; i < n; ++i) {
	            int key = new_array[i].getCustomerID();
	            int j = i - 1;

	            while (j >= 0 && new_array[j].getCustomerID() > key) {
	                new_array[j + 1] = new_array[j];
	                j = j - 1;
	            }
	       
	        }
	        return new_array;
	    }

	public void showNumEmptySeats() {
	System.out.println("There are " + numEmptySeat + " empty seats.");
	}

	public void showEmptySeats() {
	System.out.println("The following seats are empty: ");

	for(int i=0; i<seat.length; i++) {
	if(!seat[i].isOccupied()) {
	System.out.println("SeatID " + seat[i].getSeatID());
	}
	}

	}

	public void showAssignedSeats(boolean bySeatId) {

	System.out.println("Seat assignments: ");

	if (bySeatId) {
	for(int i=0; i<seat.length; i++) {
	if(seat[i].isOccupied()) {
	System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID());
	}
	}
	}
	else {
	sortSeats();
	for(int i=0; i<sortSeatID.length; i++) {
	if(sortSeatID[i].isOccupied()) {
	System.out.println("SeatID " + sortSeatID[i].getSeatID() + " assigned to CustomerID " + sortSeatID[i].getCustomerID());
	}
	}
	}

	}

	public void assignSeat(int cust_id, int seatId) {
	for(int i=0; i<seat.length; i++) {

	if(seat[i].getSeatID() == seatId) {

	if (seat[i].isOccupied()) {
	System.out.println("Seat already assigned to a customer.");
	}
	else {
	seat[i].assign(cust_id);
	numEmptySeat--;
	System.out.println("Seat Assigned!");
	}
	}
	}

	}

	public void unAssignSeat(int seatId) {
	for (int i = 0; i < seat.length; i++) {
	            if (seat[i].getSeatID() == seatId) {

	                if (seat[i].isOccupied()) {

	                    seat[i].unAssign();
	                    numEmptySeat++;
	                    System.out.println("Seat Unassigned!");

	                }
	                else {
	                    System.out.println("Seat not occupied.");
	                }
	            }
	}

	}



	}




	
