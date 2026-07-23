public class pattern_6_que {
    public static void main(String[] args) {
        /* 12345
           1234
           123
           12
           1
    }*/
    /* int n=5;

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        } */
// Pattern no 7!
        /* 1
           2 3
           4 5 6
           7 8 9
           10 11 12
         */
        int n = 5;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println("");
        }
    }
}
