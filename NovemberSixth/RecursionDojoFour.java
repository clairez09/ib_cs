package NovemberSixth;

public class RecursionDojoFour {
    public static int power(int base, int exponent){
        if (exponent==0){
            return 1;
        }
        return (base*power(base, exponent-1));
    }
    public static void main(String[] args) {
       System.out.println(power(2,3));
       System.out.println(power(5,0));
    }
}
