package collections;
import java.util.*;
public class Theatre {

	private final String theatreName;
	private List<Seat> seats = new LinkedList<>();
	
	
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;
		int lastRow = 'A' +(numRows -1);
		System.out.println("last row is " + lastRow);
		for(char row = 'A'; row <= lastRow; row++) {
			
			for( int seatNum=1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				
				seats.add(seat);
			}
			
		}
	}


	public String getTheatreName() {
		return theatreName;
	}
	
	public boolean reserveSeat(String seatNumber) {
		int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) { 
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
            System.out.println("value of low=" + low + " high=" + high + " mid = " + mid);
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
        
    }
	
	// for testing
    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
	
}

/*
  
 */

/*
 Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        
        if(foundSeat >= 0) {
        	return seats.get(foundSeat).reserve();
        } else {
        	System.out.println("There is no seat " + seatNumber);
        	return false;
        } 
 */
