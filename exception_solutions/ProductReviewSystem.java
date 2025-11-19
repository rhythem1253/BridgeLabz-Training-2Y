
class InvalidRatingException extends Exception{ public InvalidRatingException(String m){ super(m);} }
class EmptyReviewException extends Exception{ public EmptyReviewException(String m){ super(m);} }

class Review{
    public static void submitReview(int r,String c) throws Exception{
        if(r<1 || r>5) throw new InvalidRatingException("Invalid rating!");
        if(c==null || c.isBlank()) throw new EmptyReviewException("Empty review!");
        System.out.println("Review submitted!");
    }
    public static void main(String[] args){
        try{ submitReview(6,"Good"); }
        catch(InvalidRatingException e){ System.out.println(e.getMessage()); }
        catch(EmptyReviewException e){ System.out.println(e.getMessage()); }
    }
}
