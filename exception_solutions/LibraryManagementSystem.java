
import java.util.*;

class BookNotAvailableException extends Exception{ public BookNotAvailableException(String m){ super(m);} }
class InvalidReturnException extends Exception{ public InvalidReturnException(String m){ super(m);} }
class UserLimitExceededException extends Exception{ public UserLimitExceededException(String m){ super(m);} }

class Library{
    Map<String,Boolean> books = new HashMap<>();
    Map<String,Integer> userBooks = new HashMap<>();
    public Library(){
        books.put("Java", true);
        books.put("C++", true);
    }
    public void borrow(String user,String book) throws Exception{
        userBooks.putIfAbsent(user,0);
        if(userBooks.get(user)>=5) throw new UserLimitExceededException("User limit exceeded!");
        if(!books.getOrDefault(book,false)) throw new BookNotAvailableException("Book not available!");
        books.put(book,false);
        userBooks.put(user,userBooks.get(user)+1);
    }
    public void returnBook(String user,String book) throws Exception{
        if(!books.containsKey(book) || books.get(book)==true) throw new InvalidReturnException("Invalid return!");
        books.put(book,true);
        userBooks.put(user,userBooks.get(user)-1);
    }
    public static void main(String[] args){
        Library l=new Library();
        try{ l.borrow("A","Java"); l.borrow("A","Java"); }
        catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
