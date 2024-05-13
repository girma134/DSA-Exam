package Question4;

class StringBubbleSort {

    static int MAX = 100;

    public static void sortStrings(String[] arr, int n)
    {
        String tempV;
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    tempV = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempV;
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String[] arr = { "Zebra", "Apple",
                "Banana", "Orange", "Pineapple" };
        int n = arr.length;
        sortStrings(arr, n);
        System.out.println(
                "Strings in sorted order are : ");
        for (int i = 0; i < n; i++)
            System.out.println("String " + (i + 1) + " is "
                    + arr[i]);
    }
}
