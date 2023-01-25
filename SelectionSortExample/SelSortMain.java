import java.util.Scanner;

public class SelSortMain {

    public static void main(String[] args) {
        int arraySize, i, j, temp;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter array size: ");
        arraySize = in.nextInt();
        int array[] = new int[arraySize];

        System.out.println("Enter your values: ");
        for (i = 0; i < arraySize; ++i) {
            array[i] = in.nextInt();
        }
        System.out.println("Sorting array using selection sort technique.");
        for (i = 0; i < arraySize; i++) {
            for (j = i + 1; j < arraySize; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Now the array has been sorted: " + '\n');
        for (i = 0; i < arraySize; i++) {
            System.out.println(array[i]);
        }
    }
}
