package wright_problem1;
import java.security.SecureRandom;
import java.util.Scanner;
public class CAI2 {

	// contains program logic
	
	public void quiz() {
		int check = 0;
		//creates instance of random class
		SecureRandom rand = new SecureRandom();
				
		//generates 2 random integers from 0 to 9
		int rand1 = rand.nextInt(10);
		int rand2 = rand.nextInt(10);
		
		//call askQuestion
		askQuestion(rand1,rand2);
		
		//read response
		int sAnswer = readResponse();
		
		//check if answer is correct then calls matching display class
		check = isAnswerCorrect(rand1, rand2, sAnswer);
		
		//runs until student gets correct answer
		while(check == 0) {
			//read response
			sAnswer = readResponse();
			
			//check if answer is correct then calls matching display class
			check = isAnswerCorrect(rand1, rand2, sAnswer);
		}
	}
	
	//displays question to the screen
	
	private void askQuestion(int x, int y) {
		System.out.println("How much is " + x + " times " + y + "?");	
	}
	
	//reads students answer
	
	private int readResponse() {
		//take and store user input
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		
		//return student's answer
		return answer;
		
	}
	
	//calls matching display function based on correct/incorrect input
	
	private int isAnswerCorrect(int x, int y, int a) {
		
		//checks if student answer is actual answer
		if((x * y) == a) {
			displayCorrectResponse();
			return 1;
		}
		else {
			displayIncorrectResponse();
			return 0;
		}
	}
	
	
	//random answer selection for correct answers
	
	private String randomCorrectAnswers() {
		String correct;
		SecureRandom rand = new SecureRandom();
		int rand1 = rand.nextInt(4);
		switch(rand1) {
		case 0 :
		correct = "Very good!";
		break;
		case 1 :
		correct = "Excellent!";
		break;
		case 2 :
		correct = "Nice work!";
		break;
		case 3 :
		correct = "Keep up the good work!";
		break;
		default :
		correct = "Invalid";
		}
		return correct;
	}
	
	//random answer selection for incorrect answers
	
	private String randomIncorrectAnswers() {
		String incorrect;
		SecureRandom rand = new SecureRandom();
		int rand1 = rand.nextInt(4);
		switch(rand1) {
		case 0 :
		incorrect = "No. Please try again.";
		break;
		case 1 :
		incorrect = "Wrong. Try once more.";
		break;
		case 2:
		incorrect = "Don't give up!";
		break;
		case 3:
		incorrect = "No. Keep trying.";
		break;
		default :
			incorrect = "Invalid";
		}
		return incorrect;
	} 
	
	//prints when answer is  correct
	
	private void displayCorrectResponse() {
		String rand = randomCorrectAnswers();
		System.out.println(rand);
		}
		
		//prints when answer is incorrect
		
	private void displayIncorrectResponse() {
		String rand = randomIncorrectAnswers();
		System.out.println(rand);
		}
	
	//runs quiz function
	
	public static void main(String [] args) {
		CAI2 quiz2 = new CAI2();
		quiz2.quiz();
		
				
	}
}
