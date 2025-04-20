package ex_Inheritance;

public class Inheritance_Single {
    public static void main (String [] args){
        Son s1 = new Son();
        s1.sonisonlychildoffather();
        s1.fatherhasproperty();

    }
}



class Father{
    void fatherhasproperty(){
        System.out.println("Father has Gold");
    }
}

class Son extends Father{
    void  sonisonlychildoffather(){
        System.out.println("Is the only child");
    }
}
