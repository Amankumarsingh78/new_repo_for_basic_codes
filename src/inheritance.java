import org.w3c.dom.ls.LSOutput;

        import java.sql.SQLOutput;

public class inheritance {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.income = 10000;
        t1.name = "sumit";
        teacher t2 = new teacher("ankit",4500);
        t2.name= "aman";
        t2.income =0;
    }
}
class teacher{
    int income;
    String name;
    static int count;
    public teacher(){
        count++;
        System.out.println("creating an constructors");
        System.out.println(count);
    }
    public teacher(String name, int income){
        //this keyword is for to call the another constructor
        this();
        this.name = name;
        this.income = income;
        System.out.println(income+" "+name);
    }
}
class devloper extends teacher{
    
}