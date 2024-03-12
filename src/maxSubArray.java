import java.util.*;
public class maxSubArray {
    public static void main(String[] args) {
        int cur=0;
        int max=0;
        int arr[]= {12,-12,34,5,-39,67,49};
        for(int i=0;i<=6;i++){
            for(int j=0;j<=i;j++){
                cur+=arr[j];
                if(cur==0){
                    max=0;
                }
            }
            if(cur>max){
                max=cur;
                cur=0;
            }
        }
        System.out.println(max);
    }
}