public class Question9 {
    public static void main(String[] args) {

        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        char var;

        for (int i=0; i < str.length(); i++) {
            var = str.charAt(i);

            if(Character.isLetter(var)){
                letter ++;
            }
            else if (Character.isDigit(var)){
                number ++;
            }
            else if (Character.isSpaceChar(var)){
                space ++;
            }
            else {
                other ++;
            }
        }
        System.out.println("The string is : " + str);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}

