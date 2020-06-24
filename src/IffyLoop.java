import java.util.Arrays;
import java.util.Scanner;

public class IffyLoop {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);


        String[] random = new String[5];
        for (int r = 0; r < random.length; r++) {
            System.out.println("Please enter 5 random words. Word 0" + (r + 1));
            random[r] = sc.nextLine();
        }


        System.out.println("5 Random Words : " + Arrays.toString(random));
        System.out.println("Press Enter to start the next Program");
       /* while(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"))
        {
            System.out.println("Get some sleep! ");
            break;
        }
        while (!userInput.equalsIgnoreCase("yes")&& (!userInput.equalsIgnoreCase("y")))
        {
            System.out.println("You look great! ");
            break;
        }
        */
       // System.out.println("Do you want to try again? Enter n if not");
        String userInput = sc.nextLine();
        boolean redEyes;
        String reTry = "";

        while (!reTry.equals("n")) {
            System.out.println("Are your eyes red?");
            userInput = sc.nextLine();
            if ((userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"))) {
                redEyes = true;

            } else {
                redEyes = false;
            }
            if (redEyes == true) {
                System.out.println("Get some sleep! ");
            } else {
                System.out.println("You look great! ");
            }


            System.out.println("Do you want to try again? Enter n if not");
            reTry = sc.nextLine();

        }}}
