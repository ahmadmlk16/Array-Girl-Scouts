package AhmadMalik;
/*
Algorithm
1. Enter in from keyboard the number of girl scouts and save
2. declare an array with 5 entries to represent each range of cookies sold.
3. run a for loop to enter in the number of cookies sold per scout
4. run a nested if loop to determine which range the cookies sold falls into the array
5. display the 5 elements of the array.

 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of girl scouts in the troop");

        int n = keyboard.nextInt();

        int Group[] = new int[5];

        for (int i = 1; i<=n; i++) {
            System.out.println("Enter the number of cookies sold by girl scout number : " + i);
            int boxes = keyboard.nextInt();

            if (boxes >= 0 && boxes <= 10) {
                Group[0] = Group[0] + 1;
            } else if (boxes >= 11 && boxes <= 20) {
                Group[1] = Group[1] + 1;
            } else if (boxes >= 21 && boxes <= 30) {
                Group[2] = Group[2] + 1;
            } else if (boxes >= 31 && boxes <= 40) {
                Group[3] = Group[3] + 1;
            } else if (boxes >= 41) {
                Group[4] = Group[4] + 1;
            }

        }
            System.out.println(" TOTAL BOXES " + " NUMBER OF GIRL SCOUTS ");
            System.out.println(" -------------- " + " -----------------------");
            System.out.println(" 0 to 10 " + " "   + Group[0] );
            System.out.println(" 10 to 20 " + " "   + Group[1] );
            System.out.println(" 20 to 30 " + " "   + Group[2] );
            System.out.println(" 30 to 40 " + " "   + Group[3] );
            System.out.println(" 40 or more " + " "   + Group[4] );


    }
}
