import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        while(n>0){ s+=n%10; n/=10; }
        System.out.println(s);
    }
}
