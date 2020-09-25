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

        int i =0;
        System.out.println("Please enter values (separated by a space): ");
        while(i < items.length) {
//            System.out.println("Please enter values (separated by a space): ");
            if(scanner.hasNextInt()){
                items[i] = scanner.nextInt();
                i++;
            }
        }

        System.out.println("The values are: " + Arrays.toString(items));

    }
}
