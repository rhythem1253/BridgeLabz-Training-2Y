
import java.io.*;

class FileHandler{
    public FileHandler(String name) throws IOException{
        throw new IOException("File missing: "+name);
    }
    public static void main(String[] args){
        try{ FileHandler f=new FileHandler("abc.txt"); }
        catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
