public class Initalize1 {//ethu reference use panni seithirukku
    String name;
    int age;

    public static void main(String[] args){
        Initalize1 john = new Initalize1();
        john.name="john";
        john.age=13;

        System.out.println(john.name);
        System.out.println(john.age);

        Initalize1 tharsi = new Initalize1();
        tharsi.name="tharsi";
        tharsi.age=15;

        System.out.println(tharsi.name);
        System.out.println(tharsi.age);
    }
}
