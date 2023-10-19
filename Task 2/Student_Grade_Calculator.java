import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String RESET = "\u001B[0m";
        String RED_TEXT = "\u001B[31m";
        String GREEN_TEXT = "\u001B[32m";
        String YELLOW_TEXT = "\u001B[33m";
        String BLACK_BG = "\u001B[40m";
        String WHITE_BG = "\u001B[47m";
        int Astrick_LineWidth = 50; 
        
                
        for (int i = 0; i < Astrick_LineWidth; i++) {
                System.out.print("%");
            }
        System.out.println(); 
        
                
        System.out.println( RED_TEXT + BLACK_BG +"%     WELCOME TO THE STUDENT GRADE CALCULATOR    %"+ RESET);
        
                
        for (int i = 0; i < Astrick_LineWidth; i++) {
            System.out.print("%");
        }
        System.out.println(); 
            

        // Taking the number of subjects
        System.out.print(YELLOW_TEXT + BLACK_BG+ "Enter the number of subjects: "+ RESET);
        int Number_Of_Subjects = sc.nextInt();

        int Subject_Marks[] = new int[Number_Of_Subjects];
        for (int i = 0; i < Number_Of_Subjects; i++) {
            System.out.print(RED_TEXT +WHITE_BG+ "Enter marks obtained in subject " + (i+1 ) + ": "+ RESET);
            Subject_Marks[i] = sc.nextInt();
        }

        // Calculating the  total Marks
        int Total_Marks = 0;
        for (int Marks = 0; Marks < Number_Of_Subjects; Marks++) {
            Total_Marks += Subject_Marks[Marks];
        }

        // Calculating the  Average Percentage
        double Average_Percentage = (double) Total_Marks / (Number_Of_Subjects * 100) * 100;

        // Grade Calculation
        String comment ;
        char grade;
        if (Average_Percentage >=90 && Average_Percentage<=100){
            grade = 'O';
            comment="outstanding";
        }
          else if (Average_Percentage >= 80 && Average_Percentage<=89) {
            grade = 'E';
            comment="Excellent";
        } else if (Average_Percentage >= 70 && Average_Percentage<=79) {
            grade = 'A';
            comment="Very Good";
        } else if (Average_Percentage >= 60 && Average_Percentage<=69 ) {
            grade = 'B';
            comment="Good";
        } else if (Average_Percentage >= 50 && Average_Percentage<=59) {
            grade = 'C';
            comment="Fair";
        } 
          else if(Average_Percentage>=40 && Average_Percentage<=49 ){
            grade = 'D';
            comment="Below Average";
          }
        else {
            grade = 'F';
            comment="Failed";
        }

        // Display Results
        System.out.println(RED_TEXT +GREEN_TEXT+"\nResults:"+ RESET);
        System.out.println(RED_TEXT +WHITE_BG+"Total Marks of "+  Number_Of_Subjects  + "  subjects is "+ Total_Marks+ RESET);
        System.out.println(GREEN_TEXT+WHITE_BG+"The Average Percentage of " +Number_Of_Subjects+ "  subjects is  "  + Average_Percentage + "%"+ RESET);
        System.out.println(YELLOW_TEXT + WHITE_BG+"Grade Obtained:   " + grade+ RESET);
        System.out.println(GREEN_TEXT+WHITE_BG+" Performance:   " + comment+ RESET);
        sc.close();
    }



}
