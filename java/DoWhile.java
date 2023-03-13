public class DoWhile {

    public static void main(String[] args){

        int pair_numbers= 0;
        do{
            System.out.println("The even numbers are: "+ pair_numbers);
            pair_numbers= pair_numbers + 2;
            if (pair_numbers == 6)// in case of being the even number 6,we exit the loop
                break;
        }while (pair_numbers <10);//because of the break above, pair_numbers would never reach the value 10
    }
}
