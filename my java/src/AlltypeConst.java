public class AlltypeConst {

    int num;
    AlltypeConst(){//oru argumentum ellatha constructor
        num=10;
    }
    AlltypeConst(int number){//oru argument constructor
        num=number;
    }
    AlltypeConst(String messege){//oru argument constructor
        System.out.println(messege);
    }
    AlltypeConst(int num1,int num2){//multi argument constructor
        num = num1+num2;
    }
    public static void main(String[] args){
        AlltypeConst ex=new AlltypeConst();
        System.out.println(ex.num);

        AlltypeConst ex1=new AlltypeConst(20);
        System.out.println(ex1.num);

        AlltypeConst ex2 = new AlltypeConst(30,40);
        System.out.println(ex2.num);

        AlltypeConst ex3=new AlltypeConst("Hiiiiiii");
    }
}
