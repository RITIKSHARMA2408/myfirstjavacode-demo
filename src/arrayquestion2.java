public class arrayquestion2 {
    public static void main(String[] args){
        float [] marks = {99.4f,88.6f,78.40f,80.04f,92.67f};
        float num = 99.4f;
        boolean isinArray = false;
        for(float element:marks){
            if (num == element){
                isinArray =true;
                break;
            }
            if (isinArray){
                System.out.println("The value is present in the array");
            }
            else{
                System.out.println("The value is not present in the array");
            }
        }

    }
}
