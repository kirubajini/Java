
public class IfElseIfExample2 {
    public static void main(String[] args) {
        int num = 342;
        if (num < 1) {
            System.out.println("Number is less than one");
        } else if (num < 10) {
            System.out.println("It is a one digit number");
        } else if (num < 100) {
            System.out.println("It is a two digit number");
        } else if (num < 1000) {
            System.out.println("It is a three digit number");
        } else if (num < 10000) {
            System.out.println("It is a four digit number");
        } else if (num < 100000) {
            System.out.println("It is a five digit number");
        } else {
            System.out.println("number of digits grater than five");
        }
        System.out.println("Found it");
    }
}

