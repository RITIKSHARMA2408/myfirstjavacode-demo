public class arrsum {
    public static void main(String[] args){
        int [] arr = {66,74,78,88,64,74};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("The sum of array elements is: "+sum);
    }
}
