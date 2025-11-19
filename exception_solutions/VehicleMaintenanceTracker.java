
class ServiceOverdueException extends Exception{ public ServiceOverdueException(String m){ super(m);} }
class InvalidMileageException extends Exception{ public InvalidMileageException(String m){ super(m);} }

class Vehicle{
    public void checkMaintenance(int mileage, boolean overdue) throws Exception{
        if(mileage < 0) throw new InvalidMileageException("Negative mileage!");
        if(overdue) throw new ServiceOverdueException("Service overdue!");
    }
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        try{ v.checkMaintenance(-10,true); }
        catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
