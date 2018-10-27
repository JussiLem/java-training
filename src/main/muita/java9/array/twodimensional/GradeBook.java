package main.muita.java9.array.twodimensional;
// Fig. 7.18: GradeBook.java
// GradeBook class using a two-dimensional array to store grades.
public class GradeBook {
  private String courseName; // name of course this GradeBooke represents
  private int[][] grades; // array of student grades

  // constructor
  public GradeBook(String courseName, int[][] grades) {
    this.courseName = courseName;
    this.grades = grades;
  }

  // method to set the course name
  public String getCourseName(String courseName) {
    return courseName;
  }

  // method to retrieve the course name
  public String getCourseName() {
    return courseName;
  }

  // perform various operations on the data
  public void processGrades() {
    // output grades array
    outputGrades();

    // call methods getMinimum and getMaximun
    System.out.printf(
        "%n%s %d%n%s %d%n%n",
        "Lowest grade in the grade book is",
        getMinimum(),
        "Highest grade in the grade book is",
        getMaximum());

    // call outputBarChart to print grade distribution chart
    outputBarChart();
  }

  // find minimum grade
  public int getMinimum() {
    int lowGrade = grades[0][0]; // assume grades[0] is smallest

    // loop through rows of grades array
    for (int[] studentGrades : grades) {
      // loop through columns of curent row
      for (int grade : studentGrades) {
        // if grade lower that lowGrade, assign it to lowGrade
        if (grade < lowGrade) {
          lowGrade = grade; // new lowest grade
        }
      }
    }
    return lowGrade;
  }

  // find maximum grade
  public int getMaximum() {
    int highGrade = grades[0][0]; // assume grades[0] is largest

    // loop through grades array
    for (int[] studentGrades : grades) {
      // loop through rows of grades array
      for (int grade : studentGrades) {
        // if grade greater than highGrade, assign it to highGrade
        if (grade > highGrade) {
          highGrade = grade; // new highest grade
        }
      }
    }
    return highGrade;
  }

  // determine average grade for test
  public double getAverage(int[] setOfGrades) {
    int total = 0;

    // sum grades for one student
    for (int grade : setOfGrades) {
      total += grade;
    }

    // return average of grades
    return (double) total / grades.length;
  }

  // output bar chart displaying grade distribution
  public void outputBarChart() {
    System.out.println("Grade distribution:");

    // stores frequency of grades in each range of 10 grades
    int[] frequency = new int[11];
    // for each grade in GradeBook, increment the appropriate frequency
    for (int[] studentGrades : grades) {
      for (int grade : studentGrades) {
        ++frequency[grade / 10];
      }
    }

    // for each grade frequency, print bar in chart
    for (int count = 0; count < frequency.length; count++) {

      // output bar label ("00-09: ", ..., "90-99: ", "100: ")
      if (count == 10) {
        System.out.printf("%5d: ", 100);
      } else {
        System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
      }

      // print bar of asterisks
      for (int stars = 0; stars < frequency[count]; stars++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // output the contents of the grade array
  private void outputGrades() {
    System.out.printf("The grades are:%n%n");
    System.out.print("            "); // align column heads

    // create a column heading for each of the tests
    for (int test = 0; test < grades[0].length; test++) {
      System.out.printf("Test %d  ", test + 1);
    }

    System.out.println("Average"); // student average column

    // create rows/columns of text representing array grades
    for (int student = 0; student < grades.length; student++) {
      System.out.printf("Student %2d", student + 1);

      for (int test : grades[student]) { // output student's grades
        System.out.printf("%8d", test);
      }
      // call method getAverage to calculate student's average
      // pass row of grades as the argument to getAverage
      double average = getAverage(grades[student]);
      System.out.printf("%9.2f%n", average);
    }
  }
}
