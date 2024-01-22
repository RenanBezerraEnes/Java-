public class ThirdJavaClass {
    public static void main(String[] args){
        int n1 = 100;
        int n2, n3;
        n2 = ++n1;
        n3 = n1++ + --n2;

        System.out.println("Value of x : " + n1);
        System.out.println("Value of x : " + n2);
        System.out.println("Value of x : " + n3);
    }
}
