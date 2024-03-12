import java.util.Scanner;
public class insomniaCure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();
        int arr_1[] = new int [n];
        System.out.println("enter the elements : ");
        for(int i=0;i<4;i++){
            arr_1[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(i%arr_1[0]==0||i%arr_1[1]==0||i%arr_1[2]==0||i%arr_1[3]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
