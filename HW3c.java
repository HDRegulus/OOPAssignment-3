import java.util.*;

public class HW3c {
    public static void main(String[] args) {
        //Make a new Scanner to take user answers to questions
        Scanner scan = new Scanner(System.in);
        System.out.println("Reboot the computer and try to connect.");
        System.out.println("Did that fix the problem? Yes or No");

        //each answer will be scanned and then made lowercase, so it can be checked for answer
        //If any of the answers are yes, it will print nothing to stop the program
        String answer1 = scan.nextLine().toLowerCase();
        if (answer1.equals("yes")) {
            System.out.println("");
        } else {
            System.out.println("Reboot the router and try to connect.");
            System.out.println("Did that Fix the problem? Yes or No");
            String answer2 = scan.nextLine().toLowerCase();
            if (answer2.equals("yes")) {
                System.out.println("");
            } else {
                System.out.println("Make sure that the cables between the router and modem are plugged in firmly.");
                System.out.println("Did that fix the problem? Yes or No");
                String answer3 = scan.nextLine().toLowerCase();
                if (answer3.equals("yes")) {
                    System.out.println("");
                } else {
                    System.out.println("Move the router to a new location and try to connect.");
                    System.out.println("Did that fix the problem? Yes or No");
                    String answer4 = scan.nextLine().toLowerCase();
                    if (answer4.equals("yes")) {
                        System.out.println("");
                    } else {
                        System.out.println("Get a new router.");
                    }
                }
            }
        }
    }
}
