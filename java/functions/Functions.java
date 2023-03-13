package functions;

public class Functions {

    /**FUNCTIONS OUTSIDE THE MAIN FILE, WHICH we access by writing Functions.functionName() **/
    //private can only be called from the same class
    //public can be called from another class
    public static void helloWorld () {//in the void methods you do not have to put type, because they do not return anything
        System.out.println("Hello.");
    }
    //By not putting the name of the access modifier,it is "default"
    /*Differences with protected: is that a protected member can be accessed by a subclass (via inheritance) inside and
    outside the same package, but with default it is not possible */
    static void ferretName(){
        System.out.println("My ferret's name is Frizzy.");
    }

    protected static String dogsNames(){//when it is not void,you have to put the type that they return
        String dog1 = "Jack";
        String dog2 = "John";

        String dogsNames= "The names of my dogs are "+dog1+" and "+ dog2 +".";
        return dogsNames;
    }

    static String dogsNames(String name1, String name2, int age){//Function OVERLOAD,adding parameters

        String sentence= "My dogs are called " + name1 + " and " +name2+ ", and they are both "+ age + " years old.";
        return sentence;
    }

    static String dogsNames(String name1, String name2, float age){//OVERLOAD AGAIN, this time changing the type of the arguments

        String sentence= "My dogs are called " + name1 + " and " +name2+ ", and the are both "+ age + " years old.";
        return sentence;
    }

    static String getFarewell(){
        return "Arrivederci.";
    }

    private static String getGreeting() {
        return "Returning Greeting.";
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }










}

