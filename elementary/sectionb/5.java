import java.util.*;
class Main {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=0;
        for(int i=a;i<=b;i++) if(isPrime(i)) c++;
        System.out.println(c);
    }
}
