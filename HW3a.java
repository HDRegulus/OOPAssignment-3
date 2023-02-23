import java.util.*;

public class HW3a {
    public static void main(String[] args) {
        //make a new scanner to look for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int scannedInt = scan.nextInt();

        //Make a switch to output the roman numeral corresponding to the number the user inputs
        String romanNumeral;
        switch (scannedInt) {
            case 1:
                romanNumeral = "I";
                break;
            case 2:
                romanNumeral = "II";
                break;
            case 3:
                romanNumeral = "III";
                break;
            case 4:
                romanNumeral = "IV";
                break;
            case 5:
                romanNumeral = "V";
                break;
            case 6:
                romanNumeral = "VI";
                break;
            case 7:
                romanNumeral = "VII";
                break;
            case 8:
                romanNumeral = "VIII";
                break;
            case 9:
                romanNumeral = "IX";
                break;
            case 10:
                romanNumeral = "X";
                break;
            default:
                romanNumeral = "ERROR: Outside the range of 1 through 10";
                break;
        }
        System.out.println(romanNumeral);
    }
}
