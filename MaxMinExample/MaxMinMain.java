public class MaxMinMain {

    public static void main(String[] args) {
        int arrNumbers[] = {634, 8099, 1, 324, 654};
        int minNumber, maxNumber;
        System.out.println("The smallest number in the list is: " + minNumber(arrNumbers));
        System.out.println("The largest number in the list is: " + maxNumber(arrNumbers));
    }

    public static int minNumber(int list[]) {
        int min = list[0];
        for (int item = 1; item < list.length; item++) {
            if (min > list[item])
                min = list[item];
        }
        return min;
    }
    public static int maxNumber(int list[]) {
        int max = list[0];
        for (int item = 1; item < list.length; item++) {
            if (max < list[item])
                max = list[item];
        }
        return max;
    }
}
