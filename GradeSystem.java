import java.util.Scanner;
public class GradeSystem{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of Subjects ");
        int numsubjects = in.nextInt();
        
        int[] marks = new int[numsubjects];
        int total = 0;
        
        for(int i =0;i<numsubjects; i++){
        System.out.print("Enter marks for subject " + (i+1) + ": ");
        marks[i] = in.nextInt();
        total += marks[i]; 
        }
        
        double average = (double) total / numsubjects;
        double percentage = (total /(numsubjects * 100.0)) * 100;
        
        char grade;
        if(percentage>=90){
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60 ){
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("\n---Results---");
        System.out.println("Total Marks: " +total);
        System.out.println("Avergae is " +average);
        System.out.println("Grade " +grade);
        
        in.close();
    }
}