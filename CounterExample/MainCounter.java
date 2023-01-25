import java.awt.font.NumericShaper;
import java.util.Scanner;

public class MainCounter {

    public static void main(String[] args) {
        int Numbers[] = {3, 41, 24, 678, 0};

        int search = 3;
        int count = 0;

        for (int i = 0; i < Numbers.length; ++i)
            if (Numbers[i] == search)
                count++;

        System.out.println("Number of occurences of '" + search + "' in the list: " + count);
    }
}