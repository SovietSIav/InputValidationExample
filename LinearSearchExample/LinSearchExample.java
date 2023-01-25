import java.util.Arrays;
import java.util.Scanner;

public class LinSearchExample {

    public static void main(String[] args) {

        int value, numOfElements, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you wish to print in an array?");
        numOfElements = in.nextInt();
        array = new int[numOfElements];

        System.out.println("Please enter " + numOfElements + " numbers.");
        for (value = 0; value < numOfElements; ++value)
            array[value] = in.nextInt();

        System.out.println("Enter the number you wish to find.");
        search = in.nextInt();

        for (value = 0; value < numOfElements; value++) {
            if (array[value] == search) {
                System.out.println("Number " + search + " was found at location " + (value + 1) + ".");
                System.out.println("Number " + search + " was found at index " + value + ".");
                System.out.println(Arrays.toString(array));
                break;
            }
        }
        if (value == numOfElements)
            System.out.println("Number isn't present in the array.");
        System.out.println(Arrays.toString(array));
    }
}
