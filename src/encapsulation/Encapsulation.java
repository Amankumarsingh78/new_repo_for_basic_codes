package encapsulation;

import javax.crypto.KEM;

public class Encapsulation {

    public static void main(String[] args) {
        Encapsulation r = new Encapsulation();
    }
    {
        System.out.println("instance block ");
    }
    Encapsulation(){
        System.out.println("consturcktor block ");
    }
    static{
        System.out.println("static block print ");
    }

}
