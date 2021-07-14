
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforces_Round_731_A {
	
	private static int fromR, fromC, toR, toC, forbiddenR, forbiddenC;

	private static int mySolve() {
		
		int answer = Math.abs(fromR - toR) + Math.abs(fromC - toC);
		
		if(fromR == toR && fromR == forbiddenR) {
			
			int from = fromC;
			int to = toC;
			if(toC < fromC) {
				from = toC;
				to = fromC;
			}
			
			if(forbiddenC > from && forbiddenC < to)
				answer += 2;
			
			
		} else if(fromC == toC && fromC == forbiddenC) {
			
			int from = fromR;
			int to = toR;
			if(toR < fromR) {
				from = toR;
				to = fromR;
			}
			
			if(forbiddenR > from && forbiddenR < to) {
				answer += 2;
			}
			
		} 
		
		return answer;
		
	}
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			br.readLine().trim();
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			fromC = Integer.parseInt(st.nextToken());
			fromR = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine().trim(), " ");
			toC = Integer.parseInt(st.nextToken());
			toR = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine().trim(), " ");
			forbiddenC = Integer.parseInt(st.nextToken());
			forbiddenR = Integer.parseInt(st.nextToken());
			
			int answer = mySolve();
			System.out.println(answer);
			
		}
		
	}

}
