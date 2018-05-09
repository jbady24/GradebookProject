package lab9;

import java.util.Scanner;

public class GradebookModificationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner object for user input
		Scanner keyboard = new Scanner(System.in);
		Scanner stringScan = new Scanner(System.in);
		
		//Create four student arrays to hold data
		double[] studentTestScores = new double[4];
		
		//String array to contain the names
		String[] name = new String[5];
		
		Student[] students = new Student[5];
		
		
		for (int i = 0; i < studentTestScores.length; i++) 
		{
			 students[i] = new Student();
			//Prompt the user for a student name
			System.out.printf("Enter Student %d name: ", i+1);
			students[i].set_names(stringScan.nextLine());
			
			for(int j = 0; j < studentTestScores.length; ++j) 
			{
				//prompt the user for student grade
				System.out.printf("Input grade number %d: ", j+1);
				studentTestScores[j] = keyboard.nextDouble();
				
				if(studentTestScores[j] < 0) 
				{
					System.out.printf("Inavlid Input!");
					//prompt the user again for student grade
					System.out.printf("Input grade number %d: ", j);
					studentTestScores[j] = keyboard.nextDouble();
				}
			}
			students[i].setGrade(studentTestScores);
			
		}
		
		for (int j = 0; j < 1; j++) 
		{
			//Display info
			System.out.printf("Student Name: %s\n"
					+ "Student Average: %.2f\n"
					+ "Student Grade Based on Average: %c\n",
					students[j].get_names(), students[j].getAverage(), 
					students[j].studentLetterGrade());
		}
	}

}
