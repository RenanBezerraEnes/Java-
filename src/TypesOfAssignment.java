public class TypesOfAssignment {
    public static void main(String[] args) {
        //Simple Assignment
        int x = 10;
        int y;
        y = 200;

        //Chained Assignment
        //Obs: I cannot assign chain assignment during the declaration of the variable
        int a,b,c,d;
        a = b = c = d = 100;
        System.out.println("a : " + a + "b : " + b);

        //Compound Assignment
        // Whenever we use operator with assignment operator, it is known as compound assignment
        int  w = 20;
        w += 30;
        System.out.println("W : " + w);

    }
}
