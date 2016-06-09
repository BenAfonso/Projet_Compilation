package optim;

/**
 * Created by benjaminafonso on 03/06/16.
 */
public class Fib {

    private int valueToCompute;
    private int computedValue;

    /*public static int computeRec(int valueToCompute, int acc){

        if (valueToCompute == 0){
            return 0;
        }else if (valueToCompute == 1){
            return 1;
        }else{
            int acc = computeRec(valueToCompute - 2, 0);
            return computeRec(valueToCompute - 1, f1, f1+f2);
        }
    }*/

    public static int computeIt(int n){

        int res;
        if (n == 0){
            return 0;
        } else if ( n == 1){
            return 1;
        } else {
            int res1 = 0;
            int f1 = 0;
            int f2 = 1;

            while (n > 1){
                res1 = f1 + f2;
                f1=f2;
                f2=res1;
                n--;
            }
            return res1;
        }


    }

    public static void main(String[] args) {
        System.out.println("Itératif: "+computeIt(8));
       // System.out.println("Récursif: "+computeRec(8));

    }


}
