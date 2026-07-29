public class bubblesort_SP {
    public static void Callarray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int [] arr = {7,8,6,4,3};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]> arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Callarray(arr);
    }
}
