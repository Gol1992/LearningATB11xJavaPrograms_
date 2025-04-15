package ex_Task;

public class OOps_Constructor {
    public static void main (String[] args) {

        //using default constructore
        People p1 = new People();
        p1.eat();
        p1.printdetails();
        p1.sleep();

        People p2 = new People("Garima", 22 ,"Galway", "8100990077", false);
        p2.printdetails();
        p2.sleep();
        p2.eat();


    }
}

 class People{
    String name;
    int age;
    String address;
    String phonenumber;
    boolean isMale;

    //DC
    People(){
        name = "unknown";
        age = 30;
        address = "unknown";
        phonenumber = "8990044880";
        isMale = true;
    }

    //PC

     People(String name, int age, String address, String phonenumber, boolean isMale){
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.isMale = isMale;

     }

     void eat(){
         System.out.println(name+ "is eating");
     }
     void sleep(){
         System.out.println(name + "is sleeping");
     }
     void walk(){
         System.out.println(name + "is walking");
     }

     void homework(){
         System.out.println(name + "is doingHomework");
     }

     void printdetails(){
         System.out.println("Name:" + name);
         System.out.println("Age:" + age);
         System.out.println("Address" + address);
         System.out.println("PhoneNumber" + phonenumber);
         System.out.println("isMale" + isMale);
         System.out.println("------------------------------------");
     }
 }
