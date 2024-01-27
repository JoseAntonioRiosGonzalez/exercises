package CodeAcademy;

    public class PersonObject {
            int age;
            String name;

            public void set_value() {
                age = 20;
                name = "Robin";
            }

            public void get_value() {
                System.out.println("Age is " + age);
                System.out.println("Name is " + name);
            }


            public static void main(String[] args) {
                PersonObject p = new PersonObject();
                p.set_value();
                p.get_value();
            }
        }

