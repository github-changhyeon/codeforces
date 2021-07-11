
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Codeforces_Round_728_B {
	
	private static int inputN;
	private static int[] idxs = new int[200001];
	
	private static int mySolve() {
		
		int answer = 0;
		
		for(int sum = 3; sum <= 2*inputN-1; ++sum) {
			
			for(int i = 1; i*i <= sum; ++i) {
				
				if(sum % i > 0 || idxs[i] == 0 || idxs[sum/i] == 0 || i == sum/i)
					continue;
				if(idxs[i] + idxs[sum/i] == sum)
					answer += 1;
			}
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			Arrays.fill(idxs, 0);
			inputN = Integer.parseInt(br.readLine().trim());
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			for(int i = 0; i < inputN; ++i) {
				idxs[Integer.parseInt(st.nextToken())] = i + 1;
			}
			
			int resultVal = mySolve();
			System.out.println(resultVal);
			
		}
		
	}

}
