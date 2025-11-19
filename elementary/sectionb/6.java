import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        while(n>0){ c++; n/=10; }
        System.out.println(c);
    }
}
