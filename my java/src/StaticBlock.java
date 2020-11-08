public class StaticBlock {
    static int num;
    static String str;

    static {
        num=23;
        str="hello";
    }

    public static void main(String[] args){
        System.out.println(num);
        System.out.println(str);
    }
}
