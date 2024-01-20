
import java.util.Scanner;

// Create record of 5 to 7 students including the roll no's and marks in percentage.
// Sort the students with respect to the percentage and print top 3 students. You and use either bubble sort/selection sort.
// Analyse the algorithm used with proper explanation to the worst case , best case, and average case.

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size you want: ");
        int n = s.nextInt();


        int [] rollno = new int[n];
        System.out.println("Enter the roll no of students: ");
        for (int i = 0; i < rollno.length; i++) {
            rollno[i] = s.nextInt();
        }

        // for (int i = 0; i < rollno.length-1; i++) {
        //     for (int j = 0; j < rollno.length-1; j++) {
        //         if (rollno[j] > rollno[j+1]) {
        //             int temp = rollno[j];
        //             rollno[j] = rollno[j+1];
        //             rollno[j+1] = temp;
        //         }
        //     }
        // }

        int [] marks = new int[n];
        System.out.println("Enter the marks in percentage: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = s.nextInt();
        }

        

        for (int i = 0; i < marks.length-1; i++) {
            for (int j = 0; j < marks.length-1; j++) {
                if (marks[j] < marks[j+1]) {
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                    int tmp = rollno[j];
                    rollno[j] = rollno[j+1];
                    rollno[j+1] = tmp;
                }
            }
        }



        System.out.println("Top percentage");
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i] + " " + rollno[i]);
        }



    }    
}