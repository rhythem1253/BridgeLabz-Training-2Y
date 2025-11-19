
import java.time.*;

class LateSubmissionException extends Exception{ public LateSubmissionException(String m){ super(m);} }
class InvalidFileFormatException extends Exception{ public InvalidFileFormatException(String m){ super(m);} }

class OnlineExam{
    static LocalDateTime deadline = LocalDateTime.of(2025,1,1,12,0);
    public static void submitExam(String file, LocalDateTime t) throws Exception{
        if(!file.endsWith(".pdf")) throw new InvalidFileFormatException("Invalid file format");
        if(t.isAfter(deadline)) throw new LateSubmissionException("Late submission");
        System.out.println("Submitted!");
    }
    public static void main(String[] args){
        try{ submitExam("abc.txt", LocalDateTime.now()); }
        catch(Exception e){ System.out.println("Submission failed: "+e.getMessage()); }
    }
}
