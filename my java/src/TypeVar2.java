public class TypeVar2 {
    public static String myVar="static variables";
    public static void main(String[] args){
        TypeVar2 obj1 = new TypeVar2();
        TypeVar2 obj2 = new TypeVar2();
        TypeVar2 obj3 = new TypeVar2();

        System.out.println(TypeVar2.myVar);

        obj1.myVar = "updated value";

        System.out.println(obj1.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);

    }
}