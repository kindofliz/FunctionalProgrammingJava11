import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

        //Traditional (Structured) approach
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        //printAllNumbersInListStructured(numbers);
        //printEvenNumbersInListStructured(numbers);
        printOddNumbersInListStructured(numbers);

    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {

        //question to ask - HOW TO DO?
        //Loop all the numbers
        for(int number:numbers) {
            //Take each number and print it
            System.out.println(number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {

        for(int number:numbers) {
            if (number%2 == 0)
            System.out.println(number);
        }
    }

    private static void printOddNumbersInListStructured(List<Integer> numbers) {

        for(int number:numbers) {
            if (number%2 != 0)
                System.out.println(number);
        }
    }


}
