package ex_Task;

public class OOps_CreateClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sleep();
        p1.married();
        p1.greet_with_details("Tavish", 30, 15000);
        p1.person_name("Tavish");

    }
}


    class Person{
            String name;
            byte age;
            boolean isMarried;
            char gender;
            int legs;
            int salary;
            boolean hasKids;
            int number_of_kids;
            boolean is_male;
            String hair_color;

            void sleep(){
                System.out.println("Person is sleeping"); //without parameter without return
            }

            boolean married(){
                isMarried = true;
                System.out.println("Is married" + isMarried); //without parameter with return
                return isMarried;
            }

            void greet_with_details(String name, int age, double salary){
                System.out.println("Your Name" + name + "Your Age" + age + "Your Salary" + salary);
            }
            String person_name(String name){
                System.out.println("His Name" + name);
                return name;
            }
    }

