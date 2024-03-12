public class methods {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name= "Aman";
        p1.age=21;
        person p2 = new person();
        p2.name= "shiva";
        p2.age = 20 ;
        p1.walk();
        p2.play();

    }
}
class person{
    int age;
    String name;
    void walk(){
        System.out.println(name+" is walking ");
    }
    void play(){
        System.out.println(name+" is playing");
    }
}
