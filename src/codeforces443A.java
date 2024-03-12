import java.util.Scanner;
public class codeforces443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int size = n;
        System.out.print("Enter the elements : ");
        char [] arr = new char [n];
        for(int i=0;i<=n;i++){
            arr[i] = sc.next().charAt(i);
        }
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    size--;
                }
            }
        }
        System.out.println(size);
    }
}
