public abstract class Abstract2 {
    void disp(){
        System.out.println("concrete method of parent");
    }
    abstract void disp2();
}

class MyDemo extends Abstract2{
    void disp2(){
        System.out.println("Inside abstract method");
    }

    public static void main(String[] args) {
        MyDemo demo1 = new MyDemo();
        demo1.disp();
        demo1.disp2();
    }
}
