public class LL_Striver {
    public static void printn(int count){
       // int count =0;
        if(count == 6){
            return;
        }
        System.out.println(count);
        printn(count+1);
    }
    public static void main(String[] args){
        printn(0);
    }
}
