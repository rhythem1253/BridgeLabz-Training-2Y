
import java.util.Random;

class NegativeAmountException extends Exception{ public NegativeAmountException(String m){ super(m);} }
class InsufficientFundsException2 extends Exception{ public InsufficientFundsException2(String m){ super(m);} }
class NetworkFailureException extends Exception{ public NetworkFailureException(String m){ super(m);} }

class Transaction{
    public void process(int amt) throws Exception{
        int x=new Random().nextInt(3);
        if(x==0) throw new NegativeAmountException("Negative amount!");
        if(x==1) throw new InsufficientFundsException2("Insufficient balance!");
        throw new NetworkFailureException("Network failure!");
    }
    public static void main(String[] args){
        Transaction t=new Transaction();
        try{ t.process(100); }
        catch(NegativeAmountException e){ System.out.println(e.getMessage()); }
        catch(InsufficientFundsException2 e){ System.out.println(e.getMessage()); }
        catch(NetworkFailureException e){ System.out.println(e.getMessage()); }
        catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
