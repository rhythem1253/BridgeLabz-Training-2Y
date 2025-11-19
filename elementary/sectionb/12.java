import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int type=sc.nextInt();
        int s=0;
        while(n>0){
            int d=n%10;
            if(type==0 && d%2==0) s+=d;
            if(type==1 && d%2!=0) s+=d;
            n/=10;
        }
        System.out.println(s);
    }
}
