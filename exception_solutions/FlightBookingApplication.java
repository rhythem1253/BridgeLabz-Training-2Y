
class SeatUnavailableException extends Exception{ public SeatUnavailableException(String m){ super(m);} }
class PaymentFailedException2 extends Exception{ public PaymentFailedException2(String m){ super(m);} }

class Flight{
    public static void checkSeatAvailability(boolean ok) throws SeatUnavailableException{
        if(!ok) throw new SeatUnavailableException("Seat unavailable");
    }
    public static void processPayment(boolean ok) throws PaymentFailedException2{
        if(!ok) throw new PaymentFailedException2("Payment failed");
    }
    public static void bookTicket() throws Exception{
        checkSeatAvailability(false);
        processPayment(true);
    }
    public static void main(String[] args){
        try{ bookTicket(); }
        catch(SeatUnavailableException e){ System.out.println(e.getMessage()); }
        catch(PaymentFailedException2 e){ System.out.println(e.getMessage()); }
        finally{ System.out.println("Thank you for booking with us!"); }
    }
}
