package main.muita.java9;
import java.util.Scanner;
// Fig. 4.6: ClassAverage.java
// Solving the class-average problem using sentinel-controlled iteration.
public class ClassAverage {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initialization phase
        int total = 0;
        int gradeCounter = 0; // initialize # of grade to be entered next

        // prompt for input and read grade from user
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt(); // input next grade

        // loop until sentinel value read from user
        while (grade != -1) {

            total += grade; // add grade to total
            gradeCounter = gradeCounter + 1; // increment counter

            // prompt for input and read next grade from user
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        // termination phase
        // if user entered at least one grade...
        if (gradeCounter != 0) {
            // use number with decimal point to calculate average of grades
            double average = (double) total / gradeCounter;

            // display total and average (with two digits of precision)
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else { // no grades were entered, so output appropriate message
            System.out.println("No grades were entered");
        }
    }
}
