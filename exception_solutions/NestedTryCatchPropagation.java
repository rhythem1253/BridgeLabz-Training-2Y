
class NestedTry{
    public static void methodB(){
        try{
            Integer.parseInt("abc");
        }catch(NumberFormatException e){
            System.out.println("Caught in B");
        }
        String s=null;
        System.out.println(s.length());
    }
    public static void methodA(){
        try{ methodB(); }
        catch(Exception e){ System.out.println("Propagated: "+e); }
    }
    public static void main(String[] args){ methodA(); }
}
