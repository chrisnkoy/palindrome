import java.util.*;

public class Palindrome{
	public static void main(String [] args){

		System.out.println("Palindrome Checker");
		System.out.println("--------------------------------------------\n");

		/*Loop until word "exit" is entered by user*/
		while(true){

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a word (enter \"exit\" to stop the program): ");

			String word = sc.next().toLowerCase();
			Stack <Character> stack = new Stack<>();
			Queue <Character> queue = new LinkedList<>();

			if(word.equals("exit")){
				System.out.println("You have entered \"exit\". The program is closed.");
				break;
			}

			//Store word's characters one by one in the stack and queue
			for(int i = 0; i < word.length(); i++){
				stack.push(word.charAt(i));
				queue.add(word.charAt(i));
			}

			//Count number of matches
			int count = 0;
			while(!stack.isEmpty()){
				if(stack.pop().equals(queue.remove()))
					count++;
			}

			//If number of matches is equal to length of the word then
			//word is a palindrome
			if(count == word.length())
				System.out.println("--> " + word + " is a palindrome.\n");
			else
				System.out.println("--> " + word + " is NOT apalindrome.\n");

		}

	}
}