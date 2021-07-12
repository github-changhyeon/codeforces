
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Codeforces_Round_728_C {

	private static int inputN;
	private static ArrayList<Long> weights = new ArrayList<>();
	private static long[] accumulatedSum = new long[100000];
	private static long[] reverseAccumulatedSum = new long[100000];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			inputN = Integer.parseInt(br.readLine().trim());
			weights.clear();
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			for(int i = 0; i < inputN; ++i) {
				weights.add(Long.parseLong(st.nextToken()));
			}
			
			Collections.sort(weights);
			
			accumulatedSum[0] = 0;
			for(int i = 1; i < inputN; ++i) {
				accumulatedSum[i] = weights.get(i) + accumulatedSum[i-1];
			}
			
			reverseAccumulatedSum[inputN-1] = weights.get(inputN-1);
			for(int i = inputN-2; i >= 0; --i) {
				reverseAccumulatedSum[i] = weights.get(i) + reverseAccumulatedSum[i+1];
			}
			
			long resultVal = 0;
			for(int i = 2; i < inputN; ++i) {
				resultVal += -1*(reverseAccumulatedSum[i] - accumulatedSum[i-2]);
			}
			
			System.out.println(resultVal);
			
			
		}

	}

}
