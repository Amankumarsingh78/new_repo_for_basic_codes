import javax.crypto.spec.PSource;
import java.util.jar.JarOutputStream;

public class classObject {
    public static void main(String[] args) {
// object creating
        student s1 = new student();
        s1.name = "Aman";
        s1.roll = 06;
        s1.number = 7817074737L;
        //System.out.println(s1.name);
        //System.out.println(s1.roll);
        student s2 = new student();
        s2.name ="Nitin";
        s2.roll =78;
        s2.number = 8445542500L;
        s1.walk(49);
        s1.collage ("GLA University");
        s2.collage ("BSA");
        System.out.println("--> "+student.count+" <--");
    }
}
//class creating........
class student {
    int roll;
    String name;
    long number;
    // static is use for class only not for object ...
    static int count;
    //constracter.....
    public student(){
        System.out.println("first constrcter ");
        count++;
    }
    public student(int con){
        System.out.println(con);
        System.out.println("second constrcter ");
    }
    //methods........
    void collage() {
        System.out.println(name+" is go to collage "+roll);
    }
    void collage(String uniName){
        System.out.println(name +" purshuing B.tech from "+uniName+" university");
    }
    void walk(int steps) {
        System.out.println(name+" is walking "+steps+" steps.");
    }

}
