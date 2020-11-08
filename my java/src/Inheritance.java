public class Inheritance {
    String designation = "Teacher";
    String college = "ASV";

    void work() {
        System.out.println("Teaching");
    }
}

class MathsTeacher extends Inheritance {
    String subject = "Maths";

    public static void main(String[] args) {
        MathsTeacher m1= new MathsTeacher();
        System.out.println(m1.subject);
        System.out.println(m1.designation);
        System.out.println(m1.college);
        m1.work();
    }
}
