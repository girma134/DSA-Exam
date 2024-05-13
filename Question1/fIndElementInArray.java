package Question1;
import java.util.Scanner;

class findElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String sequence = scanner.nextLine();
        String[] numbersAsString = sequence.split("\\s+");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        System.out.print("Enter a number to search for: ");
        int searchNumber = scanner.nextInt();

        int occurrences = countOccurrences(numbers, searchNumber);

        if (occurrences > 0) {
            System.out.println("The number " + searchNumber + " appears " + occurrences + " time(s) in the array.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}


