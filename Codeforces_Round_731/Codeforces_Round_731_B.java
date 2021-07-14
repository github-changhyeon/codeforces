
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Codeforces_Round_731_B {

	private static Deque<Character> myDec = new ArrayDeque<Character>();
	
	private static boolean mySolve(char lastChar) {
		
		boolean answer = true;
		
		char cmpChar = lastChar;
		while(!myDec.isEmpty()) {
			
			if(cmpChar == myDec.peekFirst()) {
				cmpChar = (char)(cmpChar - 1);
				myDec.pollFirst();
			} else if(cmpChar == myDec.peekLast()) {
				cmpChar = (char)(cmpChar - 1);
				myDec.pollLast();
			} else {
				answer = false;
				break;
			}
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			String inputStr = br.readLine().trim();
			myDec.clear();
			for(int i = 0; i < inputStr.length(); ++i) {
				myDec.offerLast(inputStr.charAt(i));
			}
			
			boolean answer = mySolve((char)(inputStr.length() - 1 + 'a'));
			if(answer)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
	}

}
