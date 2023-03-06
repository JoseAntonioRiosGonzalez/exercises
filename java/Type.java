public class Type {
    public static void main(String[] args){

        //INTEGER NUMBERS
        byte number1= 1;//1 byte
        short number2 = 2;//2 byte
        int number3 = 3;//4 byte
        long number4 = 4L;// 8 byte

        //FLOATING-POINT NUMBERS
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        //CHARACTER
        char character1= 'a';

        //BOOLEANO
        boolean truth = true;
        boolean lie= false;

        //TEXT STRING
        String name= "Jean Pierre";

        //WRAPPER TYPE
        /*All of these types above are primitives except for String.
        No primitive type can be null.
        To make it null, we need to use a wrapper type.
        We'll need this, for example, when we use a database and need an integer to be null.
        */

        Integer number_a= null;
        Long number_b= 2L;


        System.out.println(number_a);
        System.out.println(number_b);

    }
}

