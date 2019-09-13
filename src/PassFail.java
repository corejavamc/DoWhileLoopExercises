/*
 * This program will ask a user for a test score to determine if a student
 * "passed" or "failed" the test.  It will continue until user types -1 to terminate.
 */

import java.util.Scanner;

public class PassFail {
    public static void main(String args[]){
        Scanner keybd = new Scanner(System.in);
        int score;

        do{
            System.out.println("Enter a student's test score. Type -1 to quit.");
            score = keybd.nextInt();

            if (score >= 60)
                System.out.println("Student passed.");

            else if ((score != -1) && (score < 60))
                System.out.println("Student failed.");

        } while (score != -1);
    }
}
