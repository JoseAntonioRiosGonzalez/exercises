public class IfElse {

    public static void main(String[] args){

        boolean check = 7<10;//here we equate "check" with a condition that is true by itself, so it takes it as true

        if(check){//by putting it like this, we are indicating in the condition that it is true
            System.out.println("The condition is true,so I'll do the following: ");

            int num1 = 3;
            int num2 = 5;
            int num3= 8;
            if((num1%2 != 0)&&(num2%2 != 0)&&(num3%2 != 0))//if there is only one line inside the if structure, it is not necessary to put braces
                System.out.println("All three numbers are odd.");

            else if ((num1%2 == 0)&&(num2%2 == 0)&&(num3%2 == 0)){
                System.out.println("All three numbers are even.");
            }
            else{
                System.out.println("There are both odd and even numbers mixed up.");
            }


        }
        else{
            System.out.println("The input condition is false,so I don't continue executing any more code.");
        }

        System.out.println("End of the program.");

    }
}
