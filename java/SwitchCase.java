public class SwitchCase {

    public static void main(String[] args){

        String cardinalPoint = "east";

        switch (cardinalPoint){

            case "north":
                System.out.println("You have to go north");
                break;
            case "south":
                System.out.println("You have to go south");
                break;
            case "east":
                System.out.println("You have to go east");
                break;
            case "west":
                System.out.println("You have to go west");
                break;
            default:
                System.out.println("Stay still and continue to wait for directions");
                break;//a good practice is to put a "break" in the "default"
        }
    }
}
