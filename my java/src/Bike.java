abstract class Bike {
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

//Creating a Child class which inherits Abstract class
class Honda extends Bike {//Default constractora uruvakkum parent classinda
    void run() {
        System.out.println("running safely..");
    }


    public static void main(String[] args) {
        Bike obj = new Honda();//bike() endu poda koodathu
        obj.run();
        obj.changeGear();
    }
}



