public class CallConst {
    CallConst(){
        System.out.println("Hello");
    }

    CallConst(String msg){
        System.out.println(msg);

    }

    CallConst(int num){
        this("hi");
        System.out.println(num);
    }

    public static void main(String[] args){
        CallConst c1=new CallConst(12);
    }
}
