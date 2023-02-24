import java.util.*;
import java.util.Arrays;

public class HW3b {
    public static void main(String[] args) {
        //Making a new scanner to get the three names
        Scanner scan = new Scanner(System.in);

        //Specify how many names we want to accept || Keep track of where we are in array
        int nameAmount = 3;
        int arrayPosition = 0;

        //Array of string names to store
        String userNames[] = new String[nameAmount];

        //Fills array with user's input names
        for (; arrayPosition < nameAmount; arrayPosition++) {
            System.out.println("Enter name " + (arrayPosition + 1) + ": ");
            userNames[arrayPosition] = scan.nextLine();
        }

        Arrays.sort(userNames);
        for (int i = 0; i < nameAmount; i++) {
            System.out.println((i + 1) + ". " + userNames[i]);
        }
    }
}
