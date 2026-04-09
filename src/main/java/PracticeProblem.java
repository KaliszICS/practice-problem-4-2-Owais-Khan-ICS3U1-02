/**
	* File: Lesson 4.2: For loops
	* Author: Owais Ali Khan
	*	Date Created: April 9, 2026
	*	Date Last Modified: April 9, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String repeatLetter(char letter, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += letter;
        }
        return result;
    }
    
    public static int countLetter(String string, char letter) {
        int count = 0;
		char current;
        int n = string.length();
        for (int i = 0; i < n; i++) {
            current = string.charAt(i);
            if (current == letter) {
                count++;
            }
        }
        return count;
    }
    
    public static int evenSum(int num1, int num2) {
        int sum = 0;
        int start;
        int end;
        if (num1 > num2) {
            start = num2;
            end = num1;
        } else {
            start = num1;
            end = num2;
        }

		if (start%2!=0) {
			start++;
		}
        
        for (int i = start; i <= end; i+=2) {
            sum += i;
        }
        
        return sum;
        
    }

}
