import java.util.*;
public class sixth{
    public static void main(String[] args){
        Scanner sc=new scanner(System.in);
        System.out.println("enter principal:");
        int p=sc.nextInt();
        System.out.println("enter rate of intrest:");
        int r=sc.nextInt();
        System.out.println("enter time period:");
        int t=sc.nextInt();
        System.out.print(p*r*t/100);
    }
}