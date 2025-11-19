import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=new int[10];
        while(n>0){ f[n%10]++; n/=10; }
        int c=0;
        for(int x:f) if(x>0) c++;
        System.out.println(c);
    }
}
