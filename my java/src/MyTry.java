public interface MyTry {
    public void method1();
    public  void method2();
}
class University implements MyTry {
    public void method1(){
        System.out.println("Dgree of university");
    }
    public void method2(){
        System.out.println("Degree of university2");
    }

    public static void main(String[] args) {
         //demo1 = new Demo();
        //demo1.method1();
        //demo1.method2();
    }
}
