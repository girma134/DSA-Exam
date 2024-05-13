package Question6;

public class DelElement {
    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }

        int[] modifiedArray = new int[array.length - 1];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                modifiedArray[newIndex] = array[i];
                newIndex++;
            }
        }

        return modifiedArray;
    }
    public static void main(String[] args) {
        int[] array = {3,7,1,9,4};
        int[] modifiedArray = deleteElement(array, 3);
        for (int i = 0; i < modifiedArray.length; i++) {
            System.out.println(modifiedArray[i]);
        }
    }

}
