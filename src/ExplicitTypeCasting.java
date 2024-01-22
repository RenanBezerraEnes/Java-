public class ExplicitTypeCasting {
    public static void main(String[] args) {
        int x = 100;
        //Without specifying the type, it will not convert
        //byte b = x

        //I need to specify the type to convert it from int to byte
        byte b = (byte)x;
        System.out.println("Value of b : " + b);
    }
}
