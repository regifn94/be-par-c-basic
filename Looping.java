public class Looping {
    public static void main(String[] args) {

        whileLoop();
        /**
         *       *
         *      ***
         *     *****
         *    *******
         *   *********
         * */
    }

    static void whileLoop(){
        int n = 5;
        int i =1;
        while(i<=n){
            int m =1;
            int k = 5;
            while(k>=i){
                System.out.print(" ");
                k--;
            }
            while (m<=(i*2) -1){
                System.out.print("*");
                m++;
            }
            System.out.println();
            i++;
        }
    }

    static void forLoop(){

    }
}
