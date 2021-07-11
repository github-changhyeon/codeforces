
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Codeforce_Round_727_C {

	private static int inputN;
	private static long inputK, inputX;
	private static long[] levels;
	private static ArrayList<Long> differs = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim(), " "); 
		inputN = Integer.parseInt(st.nextToken());
		inputK = Long.parseLong(st.nextToken());
		inputX = Long.parseLong(st.nextToken());
		
		levels = new long[inputN];
		
		st = new StringTokenizer(br.readLine().trim(), " ");
		for(int i = 0; i < inputN; ++i) {
			levels[i] = Long.parseLong(st.nextToken());
		}	
		Arrays.sort(levels);
		
		int biggerCnt = 0;
		for(int i = 0; i < inputN-1; ++i) {
			if(levels[i+1] - levels[i] > inputX) {
				biggerCnt += 1;
				differs.add(levels[i+1] - levels[i]);
			}
		}
		
		Collections.sort(differs);
		
		int mCnt = 0;
		for(int i = 0; i < differs.size(); ++i) {
			
			long q = differs.get(i)/inputX;
			long mod = differs.get(i) % inputX;
			long temp = q-1;
			if(mod > 0)
				temp += 1;
			inputK -= temp;
			if(inputK >= 0l)
				mCnt += 1;
			
		}
		
		long resultVal = biggerCnt + 1 - mCnt;
		System.out.println(resultVal);
		

	}

}
