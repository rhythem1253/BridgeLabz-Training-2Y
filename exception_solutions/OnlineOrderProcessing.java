
import java.util.Random;

class OutOfStockException extends Exception{ public OutOfStockException(String m){ super(m);} }
class PaymentFailedException extends Exception{ public PaymentFailedException(String m){ super(m);} }

class OnlineOrderProcessing{
    public static void placeOrder() throws Exception{
        int x = new Random().nextInt(2);
        if(x==0) throw new OutOfStockException("Product out of stock!");
        else throw new PaymentFailedException("Payment failed!");
    }
    public static void main(String[] args){
        try{ placeOrder(); }
        catch(OutOfStockException e){ System.out.println(e.getMessage()); }
        catch(PaymentFailedException e){ System.out.println(e.getMessage()); }
        catch(Exception e){ System.out.println("Error: "+e.getMessage()); }
    }
}
