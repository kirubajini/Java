public class Website {
    String webName;
    int webAge;

    Website(String name,int age){//constructor
        webName = name;
        webAge = age;

    }
    public static void main(String[] args){
        Website web1 = new Website("w3 school", 3);//name,age ellam nankal type panna koodathu
        Website web2 = new Website("google", 18);

        System.out.println(web1.webName);
        System.out.println(web1.webName);
        System.out.println(web2.webAge);
        System.out.println(web2.webAge);

    }
}
