
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Codeforces_Round_731_D {

	private static int inputN;
	private static ArrayList<Integer> inputList = new ArrayList<>(); 
	private static ArrayList<Integer> answers = new ArrayList<>();
	
	private static void mySolve() {
		
		answers.add(0);
		
		for(int i = 1; i < inputList.size(); ++i) {
			
			int beforeXorVal = inputList.get(i-1) ^ answers.get(i-1);
			int nowVal = inputList.get(i);
			int targetVal = beforeXorVal | nowVal;
			
			answers.add((~nowVal) & targetVal);
			
		}
		
		for(int i = 0; i < answers.size(); ++i)
			System.out.print(answers.get(i) + " ");
		System.out.println();
		
	}
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			inputList.clear();
			answers.clear();
			inputN = Integer.parseInt(br.readLine().trim());
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			for(int i = 0; i < inputN; ++i) {
				inputList.add(Integer.parseInt(st.nextToken()));
			}
			
			mySolve();
			
		}
		
	}

}
