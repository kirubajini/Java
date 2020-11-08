public interface MyInterface {//interfacukkulla abstract method maddum than use pannuvam but abstract word use panna thevaijilla
       public void method1();
       public  void method2();
}

class Demo implements MyInterface {
    public void method1(){
        System.out.println("Implementation of method1");
    }
    public void method2(){
        System.out.println("Implement of method2");
    }

    public static void main(String[] args) {
        Demo demo1 = new Demo();
        demo1.method1();
        demo1.method2();
    }
}

class DemoClass implements MyInterface{
    public void method1(){
        System.out.println("Implementation of method1");
    }
    public void method2(){
        System.out.println("Implement of method2");
    }
    public static void main(String[] args) {
        DemoClass demo2 = new DemoClass();
        demo2.method1();
        demo2.method2();
    }
}
