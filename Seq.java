import java.util.Scanner;

public class Seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] srr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            srr[i] = sc.nextInt();
        }

        int count = 0 ;
        for (int i=0; i<n; i++) {
            if(arr[i]==srr[i]){
               count += 1 ;
            }
            else if(arr[i] != srr[i]){
                int u = i ;
                int tmp = arr[i] ;
                for(int j=i+1 ;j<n ;j++){
                    arr[j-1] = arr[j];
                }
                arr[n-1] = tmp ;
                count++ ;
                i = u-1 ;
            }

        }
        System.out.println(count) ;
        //for(int i=0 ;i<n ;i++){
            //System.out.print(" "+arr[i]);
        //}

    }
}
