import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        //Functional approach
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        //printAllNumbersInListFunctional(numbers);
        //printEvenNumbersInListFunctional(numbers);
        //printOddNumbersInListFunctional(numbers);

        //printAllCoursesInListFunctional(courses);
        //printSpringCoursesInListFunctional(courses);
        //print4LetterCoursesInListFunctional(courses);

        //printSquaresOfEvenNumbersInListFunctional(numbers);
        //printQubesOfOddNumbersInListFunctional(numbers);
        printNumberOfCharInCourseNameInListFunctional(courses);

    }

    //simple method witch accepts our parameter and prints it our
    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //question to ask - WHAT TO DO?

        //1. Convert the list of numbers into a stream (a sequence of elements)
        //2. once the stream is created, I can specify what to do with each of them
        //3. create the STATIC  method print()
        //4. the use a METHOD REFERENCE (use name of the class then :: then name of the method)
//        numbers.stream().forEach(FP01Functional::print); //method reference

        //Can be simplified in this case with to avoid creating static method print
        numbers.stream().
                forEach(System.out::println);

    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

         numbers.stream()
                 //Add filter to only allow even numbers and use a lambda expression
                 // this lambda method needs to:
                 // accept number as the parameter and check if it is equal to 0
                 // number -> number%2 == 0
                 .filter(number -> number%2 == 0)
                 .forEach(System.out::println);

    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number%2 != 0)
                .forEach(System.out::println);

    }

    private static void printAllCoursesInListFunctional(List<String> courses) {

        courses.stream()
                .forEach(System.out::println);

    }

    private static void printSpringCoursesInListFunctional(List<String> courses) {

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

    }

    private static void print4LetterCoursesInListFunctional(List<String> courses) {

        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);

    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                //Add filter to only allow even numbers and use a lambda expression
                // this lambda method needs to:
                // accept number as the parameter and check if it is equal to 0
                // number -> number%2 == 0
                .filter(number -> number%2 == 0)
                //to print a square of each filtered element, do mapping
                //mapping: map each element to the square of that element and then print
                // element -> element * element
                .map(number -> number * number)
                .forEach(System.out::println);

    }

    private static void printQubesOfOddNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                //Add filter to only allow even numbers and use a lambda expression
                // this lambda method needs to:
                // accept number as the parameter and check if it is equal to 0
                // number -> number%2 == 0
                .filter(number -> number%2 != 0)
                //to print a square of each filtered element, do mapping
                //mapping: map each element to the square of that element and then print
                // element -> element * element
                .map(number -> number * number * number)
                .forEach(System.out::println);

    }


    private static void printNumberOfCharInCourseNameInListFunctional(List<String> courses) {

        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

}
