public class ParameterConst {
    int empId;
    String empName;

    ParameterConst(int id,String name){
        empId=id;
        empName=name;
    }
    void printInfo(){
        System.out.println(empId);
        System.out.println(empName);
    }
    public static void main(String[] args){
        ParameterConst emp1 = new ParameterConst(123,"john");
        emp1.printInfo();
    }

}
