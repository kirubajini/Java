
public class Animal {
    String name= "Florida";
    int speed = 10;


    void run() {
        System.out.println("My name is"+name+"I am running with speed"+speed);
    }
}
class Rabbit extends Animal{
    void hide(){
        System.out.println(name+"hides!");

    }
    public static void main(String[] args){
       Rabbit A1=new Rabbit();
        System.out.println(A1.name);
        System.out.println(A1.speed);
       // System.out.println (A1.run());
       // System.out.println(A1.hide());
    }
}
