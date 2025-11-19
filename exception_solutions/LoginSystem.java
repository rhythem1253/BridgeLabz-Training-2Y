
class InvalidCredentialsException extends Exception{
    public InvalidCredentialsException(String msg){ super(msg); }
}
class LoginSystem{
    public static void validate(String u, String p) throws InvalidCredentialsException{
        if(!u.equals("admin") || !p.equals("1234")) throw new InvalidCredentialsException("Invalid credentials!");
    }
    public static void main(String[] args){
        try{
            validate("abc","xyz");
        }catch(InvalidCredentialsException e){
            System.out.println(e.getMessage()+", try again.");
        }
    }
}
