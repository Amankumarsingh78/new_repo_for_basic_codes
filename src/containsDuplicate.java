public class containsDuplicate {
    public static void main(String[] args) {
        boolean tf=false;
        int arr[]={1,2,5,3};
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    tf=true;
                    break;
                }
            }
        }
        System.out.println(tf);
    }
}
