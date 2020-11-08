public interface Interface2 {
    public void animalSound();
    public void sleep();
}

class Pig implements Interface2{
    public void animalSound(){
        System.out.println("the pig sound");
    }
    public void sleep(){
        System.out.println("eeeeeeee");
    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}
