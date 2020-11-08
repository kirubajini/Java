public abstract class Abstract1 {//ethu oru normal class aakum ethukku abstract method use pannelathu aakave ethai abstract claasukku maththonum
    String color;//properties
    String size;//properties

    Abstract1(String color, String size){//constructor
        this.color = color;
        this.size = size;
    }

    void eat(){
        System.out.println("Eating..........");
    }
    //void sound(){
      //System.out.println("Make sound");
    abstract void sound();//ethu oru thevaijillathathu aakum enave ethai abstract methodukku maththavendum

}
class Dog extends Abstract1 {
    Dog(String color, String size){

        super(color,size);//ANIMAL CLASSLA ERUKKURA CONSTRACTORA CALL PANNUM
    }
    void sound(){
        System.out.println("Dog make sound of woof");
    }

    public static void main(String[] args){
        Dog dog1 = new Dog("Black","Large");//OBJECTA CREATE PANNIDDAM
        dog1.eat();
        dog1.sound();
    }
}
class Cat extends Abstract1{
    int age;//cat classukku maddum sonthamana property ethai thanija kudukkonum this.age=age*
    Cat(String color,String size,int age) {
        super(color, size);
        this.age = age;//*
    }
        void sound(){
            System.out.println("Cat is meow");
        }

    public static void main(String[] args) {
        Cat cat1 = new Cat("white", "small", 4);
        cat1.eat();
        cat1.sound();
    }
}
