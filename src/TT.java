public class TT {
    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = "World";
        boolean areEqual = str1.equals(str2); // areEqual = false
        System.out.println(areEqual);
        int comparisonResult = str1.compareTo(str2); // comparisonResult = -15
        System.out.println(comparisonResult);

        int[] numbers = {10, 20, 30, 40, 50};
        numbers[1] = 25; // Modifying the second element to 25
        System.out.println(numbers[1]);


    }
}