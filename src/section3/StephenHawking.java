package section3;

import javax.swing.JOptionPane;

public class StephenHawking {
	public static void main(String[] args) {
		
	
//	private static final String  = null;



// 1. make a main method and put steps 2, 3 & 4 inside it

	

	
	String answer=JOptionPane.showInputDialog("say a sentence");
	// 4. Use a for loop to repeat steps #2 and #3, a lot of times
	speak(answer);
		
	}
	// 2. ask the user for a sentence
	
	// 3. call the speak method below and send it the sentence

	

	
	


	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
