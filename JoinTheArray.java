public class JoinTheArray {
    public static void main(String[] args) {
        int[] array1 = randomArray(9);
        int[] array2 = randomArray(5);
        int[] joinArray = joinArray(array1, array2);
        printArray(array1);
        printArray(array2);
        printArray(joinArray);
    }

    public static int[] randomArray(int legth) {
        int[] array = new int[legth];
        for (int i = 0; i < legth; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }
        return array;
    }

    public static int[] joinArray(int[] array1, int[] array2) {
        int legthSize = array1.length + array2.length;
        int[] joinArray = new int[legthSize];
        for (int i = 0; i < legthSize; i++) {
            if (i < array1.length) {
                joinArray[i] = array1[i];
            } else {
                joinArray[i] = array2[i - array1.length];
            }
        }
        return joinArray;
    }

    public static void printArray(int[] array) {
        for (int x : array) {
            System.out.print(x + "\t");
        }
        System.out.println(" ");
    }
}
