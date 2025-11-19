
class AccountNotFoundException extends Exception{ public AccountNotFoundException(String m){ super(m);} }

class Bank{
    public static void verifyAccount(boolean ok) throws AccountNotFoundException{
        if(!ok) throw new AccountNotFoundException("Account not found");
    }
    public static void processTransaction(boolean ok) throws InsufficientFundsException{
        if(!ok) throw new InsufficientFundsException("Funds not enough");
    }
    public static void executeTransaction() throws Exception{
        verifyAccount(false);
        processTransaction(true);
    }
    public static void main(String[] args){
        try{ executeTransaction(); }
        catch(AccountNotFoundException e){ System.out.println(e.getMessage()); }
        catch(InsufficientFundsException e){ System.out.println(e.getMessage()); }
        catch(Exception e){ System.out.println(e.getMessage()); }
        finally{ System.out.println("Transaction complete."); }
    }
}
