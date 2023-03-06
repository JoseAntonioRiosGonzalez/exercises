public class WhileLoop {

    public static void main(String[] args){

        boolean check = true;

        int count = -1;
        while(count <10){
            count++;
            if (count == 6)
                continue;//with continue, we indicate that the loop should skip that value and move on to the next one.
            System.out.println("Printing line " + count);
        }
        System.out.println("End of the program");
    }
}
