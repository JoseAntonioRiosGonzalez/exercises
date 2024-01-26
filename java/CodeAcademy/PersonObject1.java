package CodeAcademy;

    public class PersonObject1{
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
                PersonObject1 p = new PersonObject1();
                p.set_value();
                p.get_value();
            }
        }

