public class TypeVar3 {

    public String myVar="INSTANCE VARIABLES";

    public static void main(String[] args){
        TypeVar3 obj1=new TypeVar3();
        TypeVar3 obj2=new TypeVar3();
        TypeVar3 obj3=new TypeVar3();

        obj1.myVar="updated variables";

        System.out.println(obj1.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);



    }
}
