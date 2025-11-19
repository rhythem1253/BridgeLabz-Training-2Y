
import java.util.*;

class InvalidSeatException extends Exception{ public InvalidSeatException(String m){ super(m);} }
class SeatAlreadyBookedException extends Exception{ public SeatAlreadyBookedException(String m){ super(m);} }

class MovieBooking{
    Map<Integer,Boolean> seats = new HashMap<>();
    public MovieBooking(){
        for(int i=1;i<=10;i++) seats.put(i,true);
    }
    public void book(int seat) throws Exception{
        if(!seats.containsKey(seat)) throw new InvalidSeatException("Invalid seat!");
        if(!seats.get(seat)) throw new SeatAlreadyBookedException("Seat booked!");
        seats.put(seat,false);
    }
    public static void main(String[] args){
        MovieBooking m=new MovieBooking();
        try{ m.book(1); m.book(1); }
        catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
