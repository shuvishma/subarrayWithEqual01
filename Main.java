import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt() ;
        }
        Map<Integer,Integer> mp = new HashMap<>() ;
        int sum = 0 ;
        int count = 0 ;
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                arr[i] = -1 ;
            }
            sum += arr[i] ;
            if(sum == 0) {                
                if(count < i+1) {
                    count = i+1 ;
                }   
            }
            else if(mp.containsKey(sum)) {
                if(count < i-mp.get(sum)) {
                    count = i-mp.get(sum) ;
                }
            }
            else{
                mp.put(sum, i) ;
            }
        }
        System.out.println(count);


    }
}
    