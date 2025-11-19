
import java.io.*;

class InvalidStudentException extends Exception{ public InvalidStudentException(String m){ super(m);} }

class Exam{
    public static void validateStudent(boolean valid) throws InvalidStudentException{
        if(!valid) throw new InvalidStudentException("Invalid student");
    }
    public static void submitExam() throws IOException, InvalidStudentException{
        validateStudent(false);
        throw new IOException("IO error");
    }
    public static void main(String[] args){
        try{ submitExam(); }
        catch(InvalidStudentException e){ System.out.println(e.getMessage()); }
        catch(IOException e){ System.out.println(e.getMessage()); }
        finally{ System.out.println("Exam submission process completed."); }
    }
}
