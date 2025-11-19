import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        while(n>0){
            int d=n%10;
            if(d%2!=0) s+=d;
            n/=10;
        }
        System.out.println(s);
    }
}
