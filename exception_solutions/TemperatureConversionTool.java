
class InvalidTemperatureException extends Exception{ public InvalidTemperatureException(String m){ super(m);} }

class TempConvert{
    public static double convert(double t,char unit) throws InvalidTemperatureException{
        if(unit=='C' && t < -273.15) throw new InvalidTemperatureException("Below absolute zero!");
        if(unit=='F' && t < -459.67) throw new InvalidTemperatureException("Below absolute zero!");
        return unit=='C' ? (t*9/5)+32 : (t-32)*5/9;
    }
    public static void main(String[] args){
        try{ System.out.println(convert(-300,'C')); }
        catch(Exception e){ System.out.println("Error: "+e.getMessage()); }
    }
}
