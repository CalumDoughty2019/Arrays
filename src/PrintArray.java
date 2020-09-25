import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    //variables
    int numItems;
    int[] items;
    int values;

    //CONSTRUCTORS
    //default constructor
    public PrintArray() {
        numItems = 0;
        items = new int[0];
        values = 0;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        //could use an if here to throw error message (I have opted for do-while)
        do {
            System.out.println("Please enter number of items: ");
            numItems = scanner.nextInt();
            items = new int[numItems];
            //System.out.println("");
        } while (numItems < 0);

//        for (int i = 0; i < items.length; i++) {
//            System.out.println("Please enter a value: ");
//            values = scanner.nextInt();
//            items[i] = values;
//        }

        int i = 0;
        System.out.println("Please enter values (separated by a space): ");
        while (i < items.length) {
//            System.out.println("Please enter values (separated by a space): ");
            if (scanner.hasNextInt()) {
                items[i] = scanner.nextInt();
                i++;
            }
        }

        System.out.println("The values are: " + Arrays.toString(items));

        Arrays.sort(items);
        System.out.println("The SORTED values are: " + Arrays.toString(items));


        //reverse(items);
    }

    //
    public static void reverse(int[] array) {
        int[] reverseItems = new int[array.length]; //array.length-1 ?? does it matter

        int j = 0;
        int lastIndex = (array.length)-1;
        for(int i = lastIndex; i >= 0; i--){
            int temp = array[i];

            reverseItems[j] = temp;
            j++;
        }

        System.out.println("The REVERSE values are: " + Arrays.toString(reverseItems));
    }

    //
    public static int[] copyOf(int[] array){
        int[] theCopy = new int[array.length]; //array.length-1 ?? does it matter

        int j = 0;
        for(int i = 0; i < theCopy.length; i++){
            int temp = array[i];
            theCopy[j] = temp;
            j++;
        }
        return theCopy;
    }

    //
    public static boolean swap(int[] array1, int[] array2){
        if(array1.length == array2.length){
            for(int i = 0; i < array1.length; i++){
                int temp1 = array1[i];
                int temp2 = array2[i];
                array1[i] = temp2;
                array2[i] = temp1;
            }

            System.out.println("Array 1 swapped: " + Arrays.toString(array1));
            System.out.println("Array 2 swapped: " + Arrays.toString(array2));
        }
        else{
            return false;
        }
        return true;
    }
}
