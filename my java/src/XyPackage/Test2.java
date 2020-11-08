package XyPackage;

import AbcPackage.Addition;

public class Test2 {
    public static void main(String[] args){
        Addition addition=new Addition();
        int add=addition.addTwoNumbers(12,13);
        System.out.println(add);
    }

}

