public class inheritancInClass {
    public static void main(String[] args) {
        p p1 = new p();
        p1.fun();
        c c1 = new c();
        c1.name="bmw";
        p p2 = new c();
        p2.name = "niten";
        System.out.println(p2.name);
    }
}
class p{
    int d0 = 0;
    int d1 = 1;
    String name;
    String colour;
    public void fun(){
        System.out.println("fun in p");
    }
}
class c extends p{
    String type;
}