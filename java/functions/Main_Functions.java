package functions;


public class Main_Functions {
    /** MAIN **/
    public static void main(String[] args) {

        Functions.helloWorld();
        byeWorld();
        Functions.ferretName();
        System.out.println(Functions.dogsNames());
        System.out.println(Functions.dogsNames("Jack","John", 2));
        System.out.println(Functions.dogsNames("Jack","John",2.5f));
        System.out.println(Functions.getFarewell());

    }
    /** END OF MAIN **/



    /** FUNCTIONS WITHIN THE SAME MAIN FILE **/

    public static void byeWorld(){
        System.out.println("Bye.");
    }
}
