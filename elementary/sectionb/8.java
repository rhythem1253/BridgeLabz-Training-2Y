import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=new int[10];
        int t=n;
        while(t>0){ f[t%10]++; t/=10; }
        int c=0;
        for(int x:f) if(x==1) c++;
        System.out.println(c);
    }
}
