public class Occurance {

        public static void main(String[] args) {
            String str = "This website is awesome.";
            char ch = 'e';
            int occurance = 0;

            for(int i = 0; i < str.length(); i++) {
                if(ch == str.charAt(i)) {
                    ++occurance;
                }
            }

            System.out.println("Frequency of " + ch + " = " + occurance);
        }
    }

