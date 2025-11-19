import java.util.*;
public class seventh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();}
        int c=0;
        for (int i=0;i<5;i++){
            if (arr[i]%2==0){
                c++;
        }
    }
       System.out.print(c);
}
}