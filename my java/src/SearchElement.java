public class SearchElement {
    public static void main(String[] args){
        int[] numbers = {11,9,88,10,90,3,19};

        int searchEle=10;

        for (int number: numbers){
            System.out.println("Element" +number);
            if (number==searchEle) {
                System.out.println("found the search element");
                    break;
            }
        }

    }
}
