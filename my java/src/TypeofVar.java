public class TypeofVar {
    public String myVar="class variable";//classukkulla define pannijirukku* change str=myVar

    public void myMethod(){
        String myVar="inside methods";//methodukkulla define pannijirukku localvarible
        System.out.println(myVar);
    }
    public static void main(String[] args){
        TypeofVar instance=new TypeofVar();
        instance.myMethod();

      System.out.println(instance.myVar);//*
    }
}
